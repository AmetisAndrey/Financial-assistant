package com.financial.financial_assistant.repository;

import com.financial.financial_assistant.model.entity.Category;
import com.financial.financial_assistant.model.enums.CategoryType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findByUserId(Long userId);
    List<Category> findByIsSystemTrue();
    List<Category> findByUserIdOrIsSystemTrue(Long userId);
    List<Category> findByUserIdAndType(Long userId, CategoryType type);
    List<Category> findByUserIdOrIsSystemTrueAndType(Long userId, CategoryType type);
}