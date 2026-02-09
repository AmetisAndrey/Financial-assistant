package com.financial.financial_assistant.model.dto.response;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class ForecastResponse {

    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal startingBalance;
    private BigDecimal endingBalance;
    private BigDecimal totalExpectedIncome;
    private BigDecimal totalExpectedExpense;
    private BigDecimal netFlow;
    private List<DailyForecast> dailyForecasts;
    private List<CategorySpending> categoryBreakdown;

    // Constructors
    public ForecastResponse() {}

    public ForecastResponse(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalExpectedIncome = BigDecimal.ZERO;
        this.totalExpectedExpense = BigDecimal.ZERO;
        this.netFlow = BigDecimal.ZERO;
    }

    // Getters and Setters
    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public BigDecimal getStartingBalance() { return startingBalance; }
    public void setStartingBalance(BigDecimal startingBalance) { this.startingBalance = startingBalance; }

    public BigDecimal getEndingBalance() { return endingBalance; }
    public void setEndingBalance(BigDecimal endingBalance) { this.endingBalance = endingBalance; }

    public BigDecimal getTotalExpectedIncome() { return totalExpectedIncome; }
    public void setTotalExpectedIncome(BigDecimal totalExpectedIncome) { this.totalExpectedIncome = totalExpectedIncome; }

    public BigDecimal getTotalExpectedExpense() { return totalExpectedExpense; }
    public void setTotalExpectedExpense(BigDecimal totalExpectedExpense) { this.totalExpectedExpense = totalExpectedExpense; }

    public BigDecimal getNetFlow() { return netFlow; }
    public void setNetFlow(BigDecimal netFlow) { this.netFlow = netFlow; }

    public List<DailyForecast> getDailyForecasts() { return dailyForecasts; }
    public void setDailyForecasts(List<DailyForecast> dailyForecasts) { this.dailyForecasts = dailyForecasts; }

    public List<CategorySpending> getCategoryBreakdown() { return categoryBreakdown; }
    public void setCategoryBreakdown(List<CategorySpending> categoryBreakdown) { this.categoryBreakdown = categoryBreakdown; }
}
