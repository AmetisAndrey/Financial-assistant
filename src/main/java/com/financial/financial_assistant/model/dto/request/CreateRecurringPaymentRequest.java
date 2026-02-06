package com.financial.financial_assistant.model.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;

public class CreateRecurringPaymentRequest {

    @NotBlank(message = "Название обязательно")
    @Size(min=2, max=100, message= "Название должно быть от 2 до 100 символов")
    private String name;

    @NotNull(message =  "Сумма обязательна")
    @Positive(message = "Сумма не может быть отрицательной")
    private BigDecimal amount;

    @NotNull(message = "Дата обязательна")
    private LocalDate startDate;
    private LocalDate endDate;

    @NotNull(message = "Тип периодичности обязателен")
    private String frequency;

    @NotNull(message = "Тип платежа обязателен")
    private String type;

    private Long categoryId;
    private Long accountId;
    private String description;

    public CreateRecurringPaymentRequest(){}
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public String getFrequency() { return frequency; }
    public void setFrequency(String frequency) { this.frequency = frequency; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Long getCategoryId() { return categoryId; }
    public void setCategoryId(Long categoryId) { this.categoryId = categoryId; }

    public Long getAccountId() { return accountId; }
    public void setAccountId(Long accountId) { this.accountId = accountId; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}




