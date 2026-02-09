package com.financial.financial_assistant.model.dto.request;

import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class UpdateTransactionRequest {

    @Positive(message = "Сумма должна быть положительной")
    private BigDecimal amount;

    private String description;
    private LocalDateTime date;
    private Long accountId;
    private Long categoryId;
    private String type;
    private String tags;

    // Constructors
    public UpdateTransactionRequest() {}

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

    public String getTags() { return tags; }
    public void setTags(String tags) { this.tags = tags; }
}