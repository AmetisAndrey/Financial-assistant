package com.financial.financial_assistant.model.dto.response;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class DashboardSummary {

    private BigDecimal totalBalance;
    private BigDecimal monthlyIncome;
    private BigDecimal monthlyExpense;
    private BigDecimal monthlyNet;
    private BigDecimal yearlyIncome;
    private BigDecimal yearlyExpense;
    private LocalDate periodStart;
    private LocalDate periodEnd;
    private List<CategorySpending> topSpendingCategories;
    private List<AccountSummary> accountSummaries;

    // Nested AccountSummary class
    public static class AccountSummary {
        private Long accountId;
        private String accountName;
        private String accountType;
        private BigDecimal balance;
        private BigDecimal monthlyChange;

        // Constructors
        public AccountSummary() {}

        // Getters and Setters
        public Long getAccountId() { return accountId; }
        public void setAccountId(Long accountId) { this.accountId = accountId; }

        public String getAccountName() { return accountName; }
        public void setAccountName(String accountName) { this.accountName = accountName; }

        public String getAccountType() { return accountType; }
        public void setAccountType(String accountType) { this.accountType = accountType; }

        public BigDecimal getBalance() { return balance; }
        public void setBalance(BigDecimal balance) { this.balance = balance; }

        public BigDecimal getMonthlyChange() { return monthlyChange; }
        public void setMonthlyChange(BigDecimal monthlyChange) { this.monthlyChange = monthlyChange; }
    }

    // Constructors
    public DashboardSummary() {
        this.totalBalance = BigDecimal.ZERO;
        this.monthlyIncome = BigDecimal.ZERO;
        this.monthlyExpense = BigDecimal.ZERO;
        this.monthlyNet = BigDecimal.ZERO;
        this.yearlyIncome = BigDecimal.ZERO;
        this.yearlyExpense = BigDecimal.ZERO;
    }

    // Getters and Setters
    public BigDecimal getTotalBalance() { return totalBalance; }
    public void setTotalBalance(BigDecimal totalBalance) { this.totalBalance = totalBalance; }

    public BigDecimal getMonthlyIncome() { return monthlyIncome; }
    public void setMonthlyIncome(BigDecimal monthlyIncome) { this.monthlyIncome = monthlyIncome; }

    public BigDecimal getMonthlyExpense() { return monthlyExpense; }
    public void setMonthlyExpense(BigDecimal monthlyExpense) { this.monthlyExpense = monthlyExpense; }

    public BigDecimal getMonthlyNet() { return monthlyNet; }
    public void setMonthlyNet(BigDecimal monthlyNet) { this.monthlyNet = monthlyNet; }

    public BigDecimal getYearlyIncome() { return yearlyIncome; }
    public void setYearlyIncome(BigDecimal yearlyIncome) { this.yearlyIncome = yearlyIncome; }

    public BigDecimal getYearlyExpense() { return yearlyExpense; }
    public void setYearlyExpense(BigDecimal yearlyExpense) { this.yearlyExpense = yearlyExpense; }

    public LocalDate getPeriodStart() { return periodStart; }
    public void setPeriodStart(LocalDate periodStart) { this.periodStart = periodStart; }

    public LocalDate getPeriodEnd() { return periodEnd; }
    public void setPeriodEnd(LocalDate periodEnd) { this.periodEnd = periodEnd; }

    public List<CategorySpending> getTopSpendingCategories() { return topSpendingCategories; }
    public void setTopSpendingCategories(List<CategorySpending> topSpendingCategories) { this.topSpendingCategories = topSpendingCategories; }

    public List<AccountSummary> getAccountSummaries() { return accountSummaries; }
    public void setAccountSummaries(List<AccountSummary> accountSummaries) { this.accountSummaries = accountSummaries; }
}