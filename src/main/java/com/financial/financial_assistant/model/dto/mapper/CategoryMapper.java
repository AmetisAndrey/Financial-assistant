package com.financial.financial_assistant.model.dto.mapper;

import com.financial.financial_assistant.model.entity.Category;
import com.financial.financial_assistant.model.dto.request.CreateCategoryRequest;
import com.financial.financial_assistant.model.dto.response.CategoryResponse;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {

    public Category toEntity(CreateCategoryRequest request) {
        Category category = new Category();
        category.setName(request.getName());
        category.setType(request.getType());
        category.setDescription(request.getDescription());
        category.setIcon(request.getIcon());
        category.setColor(request.getColor());
        return category;
    }

    public CategoryResponse toResponse(Category category) {
        if (category == null) {
            return null;
        }

        CategoryResponse response = new CategoryResponse();
        response.setId(category.getId());
        response.setName(category.getName());
        response.setType(category.getType());
        response.setDescription(category.getDescription());
        response.setIcon(category.getIcon());
        response.setColor(category.getColor());
        response.setCreatedAt(category.getCreatedAt());
        response.setUpdatedAt(category.getUpdatedAt());

        if (category.getParentCategory() != null) {
            response.setParentCategory(toResponse(category.getParentCategory()));
        }

        return response;
    }

    public void updateEntity(Category category, CreateCategoryRequest request) {
        if (request.getName() != null) {
            category.setName(request.getName());
        }
        if (request.getType() != null) {
            category.setType(request.getType());
        }
        if (request.getDescription() != null) {
            category.setDescription(request.getDescription());
        }
        if (request.getIcon() != null) {
            category.setIcon(request.getIcon());
        }
        if (request.getColor() != null) {
            category.setColor(request.getColor());
        }
    }
}
