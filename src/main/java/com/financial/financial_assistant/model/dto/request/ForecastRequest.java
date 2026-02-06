package com.financial.financial_assistant.model.dto.request;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

public class ForecastRequest {

    @NotNull(message = "Дата начала обязательна")
    private LocalDate startDate;

    @NotNull(message = "Дата окончания обязательна")
    private LocalDate endDate;

    private boolean includeRecurringPayments = true;
    private boolean includeRegularTransactions = true;
    private Long accountId; // если null - для всех счетов

    // Constructors
    public ForecastRequest() {}

    public ForecastRequest(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and Setters
    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public boolean isIncludeRecurringPayments() { return includeRecurringPayments; }
    public void setIncludeRecurringPayments(boolean includeRecurringPayments) { this.includeRecurringPayments = includeRecurringPayments; }

    public boolean isIncludeRegularTransactions() { return includeRegularTransactions; }
    public void setIncludeRegularTransactions(boolean includeRegularTransactions) { this.includeRegularTransactions = includeRegularTransactions; }

    public Long getAccountId() { return accountId; }
    public void setAccountId(Long accountId) { this.accountId = accountId; }
}