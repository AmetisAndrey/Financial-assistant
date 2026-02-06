package com.financial.financial_assistant.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CreateTransactionRequest {

    @NotNull(message = "Сумма обязательна")
    @Positive(message = "Сумма должна быть положительной")
    private BigDecimal amount;

    private String description;

    @NotNull(message = "Дата обязательна")
    private LocalDateTime date;

    @NotNull(message = "ID счёта обязателен")
    private Long accountId;

    @NotNull(message = "ID категории обязателен")
    private Long categoryId;

    @NotNull(message = "Тип транзакции обязателен")
    private String type; // INCOME или EXPENSE

    private Long recurringPaymentId;
    private String tags;

    // Constructors
    public CreateTransactionRequest() {}

    public CreateTransactionRequest(BigDecimal amount, Long accountId, Long categoryId, String type) {
        this.amount = amount;
        this.accountId = accountId;
        this.categoryId = categoryId;
        this.type = type;
        this.date = LocalDateTime.now();
    }

    // Getters and Setters
    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }

    public Long getAccountId() { return accountId; }
    public void setAccountId(Long accountId) { this.accountId = accountId; }

    public Long getCategoryId() { return categoryId; }
    public void setCategoryId(Long categoryId) { this.categoryId = categoryId; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Long getRecurringPaymentId() { return recurringPaymentId; }
    public void setRecurringPaymentId(Long recurringPaymentId) { this.recurringPaymentId = recurringPaymentId; }

    public String getTags() { return tags; }
    public void setTags(String tags) { this.tags = tags; }
}