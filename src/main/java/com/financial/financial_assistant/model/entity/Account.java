package com.financial.financial_assistant.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persostence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="accounts")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EntityListeners(AuditingEntityListener.class)
public class Account {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private AccountType type;

    @Column(nullable = false, precision = 15, scale = 2)
    @Builder.Default
    private BigDecimal balance = BigDecimal.ZERO;

    @Column(length = 3)
    @Builder.Default
    private String currency = "RUB";

    @Column(length = 7)
    private String color;

    @Column(nullable = false)
    @Builder.Default
    private Boolean isActive = true;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Transaction> transactions;

    @OneToMany(mappedBy = "transferToAccount")
    private List<Transaction> transferInTransactions;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<RecurringPayment> recurringPayments;

    @PrePersist
    @PreUpdate
    public void validateBalance(){
        if (balance.compareTo(BigDecimal.ZERO)< 0){
            throw new IllegalArgumentException("Баланс не может быть отрицательным");
        }
    }
    public void addToBalance(BigDecimal amount){
        this.balance = this.balance.add(amount);
    }
    public void subtractFromBalance(BigDecimal amount){
        if (this.balance.compareTo((amount)< 0){
            throw new IllegalArgumentException("Недостаточный баланс");
        }
        this.balance = this.balance.subtract(amount);
    }
}

