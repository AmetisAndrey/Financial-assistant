package com.financial.financial_assistant.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;

public class CreateAccountRequest {

    @NotBlank(message = "Название счёта обязательно")
    @Size(min = 2, max = 100, message = "Название счёта должно быть от 2 до 100 символов")
    private String name;

    @NotNull(message = "Начальный баланс обязателен")
    @Positive(message = "Баланс не может быть отрицательным!")
    private BigDecimal initialBalance;

    @NotBlank(message = "Тип счёта обязателен")
    private String accountType;

    private String currency;
    private String description;

    // Constructors
    public CreateAccountRequest() {}

    public CreateAccountRequest(String name, BigDecimal initialBalance, String accountType) {
        this.name = name;
        this.initialBalance = initialBalance;
        this.accountType = accountType;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public BigDecimal getInitialBalance() { return initialBalance; }
    public void setInitialBalance(BigDecimal initialBalance) { this.initialBalance = initialBalance; }

    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}