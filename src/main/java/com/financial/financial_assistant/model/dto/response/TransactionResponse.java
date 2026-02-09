package com.financial.financial_assistant.model.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionResponse {

    private Long id;
    private BigDecimal amount;
    private String description;
    private LocalDateTime date;
    private String type; // INCOME или EXPENSE
    private AccountResponse account;
    private CategoryResponse category;
    private String tags;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private RecurringPaymentInfo recurringPayment;

    // Nested RecurringPaymentInfo class
    public static class RecurringPaymentInfo {
        private Long id;
        private String name;
        private String frequency;

        // Constructors
        public RecurringPaymentInfo() {}

        public RecurringPaymentInfo(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        // Getters and Setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getFrequency() { return frequency; }
        public void setFrequency(String frequency) { this.frequency = frequency; }
    }

    // Constructors
    public TransactionResponse() {}

    public TransactionResponse(Long id, BigDecimal amount, LocalDateTime date, String type) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.type = type;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public AccountResponse getAccount() { return account; }
    public void setAccount(AccountResponse account) { this.account = account; }

    public CategoryResponse getCategory() { return category; }
    public void setCategory(CategoryResponse category) { this.category = category; }

    public String getTags() { return tags; }
    public void setTags(String tags) { this.tags = tags; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    public RecurringPaymentInfo getRecurringPayment() { return recurringPayment; }
    public void setRecurringPayment(RecurringPaymentInfo recurringPayment) { this.recurringPayment = recurringPayment; }
}