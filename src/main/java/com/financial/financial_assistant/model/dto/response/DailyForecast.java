package com.financial.financial_assistant.model.dto.response;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class DailyForecast {

    private LocalDate date;
    private BigDecimal expectedIncome;
    private BigDecimal expectedExpense;
    private BigDecimal netFlow;
    private BigDecimal projectedBalance;
    private List<ForecastItem> items;

    // Nested ForecastItem class
    public static class ForecastItem {
        private String type; // TRANSACTION или RECURRING
        private String name;
        private BigDecimal amount;
        private String categoryName;
        private String accountName;

        // Constructors
        public ForecastItem() {}

        public ForecastItem(String type, String name, BigDecimal amount) {
            this.type = type;
            this.name = name;
            this.amount = amount;
        }

        // Getters and Setters
        public String getType() { return type; }
        public void setType(String type) { this.type = type; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public BigDecimal getAmount() { return amount; }
        public void setAmount(BigDecimal amount) { this.amount = amount; }

        public String getCategoryName() { return categoryName; }
        public void setCategoryName(String categoryName) { this.categoryName = categoryName; }

        public String getAccountName() { return accountName; }
        public void setAccountName(String accountName) { this.accountName = accountName; }
    }

    // Constructors
    public DailyForecast() {}

    public DailyForecast(LocalDate date) {
        this.date = date;
        this.expectedIncome = BigDecimal.ZERO;
        this.expectedExpense = BigDecimal.ZERO;
        this.netFlow = BigDecimal.ZERO;
    }

    // Getters and Setters
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public BigDecimal getExpectedIncome() { return expectedIncome; }
    public void setExpectedIncome(BigDecimal expectedIncome) { this.expectedIncome = expectedIncome; }

    public BigDecimal getExpectedExpense() { return expectedExpense; }
    public void setExpectedExpense(BigDecimal expectedExpense) { this.expectedExpense = expectedExpense; }

    public BigDecimal getNetFlow() { return netFlow; }
    public void setNetFlow(BigDecimal netFlow) { this.netFlow = netFlow; }

    public BigDecimal getProjectedBalance() { return projectedBalance; }
    public void setProjectedBalance(BigDecimal projectedBalance) { this.projectedBalance = projectedBalance; }

    public List<ForecastItem> getItems() { return items; }
    public void setItems(List<ForecastItem> items) { this.items = items; }
}