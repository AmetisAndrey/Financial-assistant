package com.financial.financial_assistant.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class CreateCategoryRequest {

    @NotNull(message = "Название категории должно быть заполнено!")
    @Size(min=2, max=50, message = "Название категории должно быть от 2 до 50 символов")
    private String name;

    @NotNull(message = "Тип категории обязателен")
    private String type;

    private String description;
    private String icon;
    private String color;
    private Long parentCategoryId;

    // constructors
    public CreateCategoryRequest(){}

    public CreateCategoryRequest (String name, String type){
        this.name = name;
        this.type = type;
    }

    // Getters&Setters

    public String getName(){return name;}
    public void setName(String name) {this.name = name;}

    public String getType(){return type;}
    public void setType(String type) {this.type = type;}

    public String getDescription(){return description;}
    public void setDescription(String description) {this.description = description;}

    public String getIcon() {return icon;}
    public void setIcon(String icon) {this.icon = icon;}

    public String getColor(){ return color; }
    public void setColor(String color) {this.color = color;}

    public Long getParentCategoryId(){return parentCategoryId;}
    public void setParentCategoryId(Long parentCategoryId) {this.parentCategoryId = parentCategoryId;}

}

