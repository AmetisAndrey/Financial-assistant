package com.financial.financial_assistant.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI financialAssistantOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Financial Assistant API")
                        .description("API для управления личными финансами с прогнозированием")
                        .version("v1.0.0")
                        .contact(new Contact()
                                .name("Financial Assistant Team")
                                .email("support@financial-assistant.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://springdoc.org")))
                .schemaRequirement("bearerAuth", new SecurityScheme()
                        .type(SecurityScheme.Type.HTTP)
                        .scheme("bearer")
                        .bearerFormat("JWT"));
    }
}