package com.financial.financial_assistant.config;

import com.financial.financial_assistant.model.entity.Category;
import com.financial.financial_assistant.model.enums.CategoryType;
import com.financial.financial_assistant.repository.CategoryRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class DatabaseInitializer {

    private final CategoryRepository categoryRepository;

    @PostConstruct
    @Transactional
    public void init() {
        initSystemCategories();
    }

    private void initSystemCategories() {
        if (categoryRepository.countByIsSystemTrue() > 0) {
            log.info("System categories already exist");
            return;
        }

        List<Category> systemCategories = Arrays.asList(

                createSystemCategory("Food & Dining", CategoryType.EXPENSE, "#EF4444", "utensils"),
                createSystemCategory("Groceries", CategoryType.EXPENSE, "#10B981", "shopping-cart"),
                createSystemCategory("Restaurants", CategoryType.EXPENSE, "#F59E0B", "coffee"),
                createSystemCategory("Transportation", CategoryType.EXPENSE, "#3B82F6", "car"),
                createSystemCategory("Fuel", CategoryType.EXPENSE, "#6366F1", "fuel"),
                createSystemCategory("Public Transport", CategoryType.EXPENSE, "#8B5CF6", "bus"),
                createSystemCategory("Taxi", CategoryType.EXPENSE, "#EC4899", "taxi"),
                createSystemCategory("Housing", CategoryType.EXPENSE, "#14B8A6", "home"),
                createSystemCategory("Rent", CategoryType.EXPENSE, "#0EA5E9", "house"),
                createSystemCategory("Mortgage", CategoryType.EXPENSE, "#06B6D4", "bank"),
                createSystemCategory("Utilities", CategoryType.EXPENSE, "#F97316", "bolt"),
                createSystemCategory("Electricity", CategoryType.EXPENSE, "#FBBF24", "zap"),
                createSystemCategory("Water", CategoryType.EXPENSE, "#60A5FA", "droplets"),
                createSystemCategory("Internet", CategoryType.EXPENSE, "#8B5CF6", "wifi"),
                createSystemCategory("Healthcare", CategoryType.EXPENSE, "#EF4444", "heart"),
                createSystemCategory("Medicines", CategoryType.EXPENSE, "#FCA5A5", "pill"),
                createSystemCategory("Doctor", CategoryType.EXPENSE, "#F87171", "stethoscope"),
                createSystemCategory("Entertainment", CategoryType.EXPENSE, "#EC4899", "film"),
                createSystemCategory("Movies", CategoryType.EXPENSE, "#F472B6", "video"),
                createSystemCategory("Music", CategoryType.EXPENSE, "#C084FC", "music"),
                createSystemCategory("Sports", CategoryType.EXPENSE, "#10B981", "dumbbell"),
                createSystemCategory("Shopping", CategoryType.EXPENSE, "#6366F1", "shopping-bag"),
                createSystemCategory("Clothing", CategoryType.EXPENSE, "#8B5CF6", "shirt"),
                createSystemCategory("Electronics", CategoryType.EXPENSE, "#06B6D4", "smartphone"),
                createSystemCategory("Education", CategoryType.EXPENSE, "#14B8A6", "book"),
                createSystemCategory("Courses", CategoryType.EXPENSE, "#0EA5E9", "graduation-cap"),
                createSystemCategory("Books", CategoryType.EXPENSE, "#6366F1", "book-open"),
                createSystemCategory("Personal Care", CategoryType.EXPENSE, "#F97316", "user"),
                createSystemCategory("Salon", CategoryType.EXPENSE, "#F59E0B", "scissors"),
                createSystemCategory("Gym", CategoryType.EXPENSE, "#10B981", "dumbbell"),
                createSystemCategory("Travel", CategoryType.EXPENSE, "#8B5CF6", "plane"),
                createSystemCategory("Flights", CategoryType.EXPENSE, "#3B82F6", "plane"),
                createSystemCategory("Hotels", CategoryType.EXPENSE, "#EC4899", "hotel"),
                createSystemCategory("Gifts", CategoryType.EXPENSE, "#F472B6", "gift"),
                createSystemCategory("Donations", CategoryType.EXPENSE, "#10B981", "hand-heart"),
                createSystemCategory("Insurance", CategoryType.EXPENSE, "#6366F1", "shield"),
                createSystemCategory("Taxes", CategoryType.EXPENSE, "#EF4444", "file-text"),
                createSystemCategory("Other Expenses", CategoryType.EXPENSE, "#6B7280", "more-horizontal"),

                createSystemCategory("Salary", CategoryType.INCOME, "#10B981", "dollar-sign"),
                createSystemCategory("Freelance", CategoryType.INCOME, "#3B82F6", "briefcase"),
                createSystemCategory("Business", CategoryType.INCOME, "#8B5CF6", "building"),
                createSystemCategory("Investment", CategoryType.INCOME, "#F59E0B", "trending-up"),
                createSystemCategory("Dividends", CategoryType.INCOME, "#EC4899", "chart-line"),
                createSystemCategory("Rental Income", CategoryType.INCOME, "#14B8A6", "home"),
                createSystemCategory("Gift", CategoryType.INCOME, "#F472B6", "gift"),
                createSystemCategory("Refund", CategoryType.INCOME, "#0EA5E9", "rotate-ccw"),
                createSystemCategory("Bonus", CategoryType.INCOME, "#F97316", "award"),
                createSystemCategory("Other Income", CategoryType.INCOME, "#6B7280", "more-horizontal")
        );

        categoryRepository.saveAll(systemCategories);
        log.info("Created {} system categories", systemCategories.size());
    }

    private Category createSystemCategory(String name, CategoryType type, String color, String icon) {
        return Category.builder()
                .name(name)
                .type(type)
                .color(color)
                .icon(icon)
                .isSystem(true)
                .build();
    }
}