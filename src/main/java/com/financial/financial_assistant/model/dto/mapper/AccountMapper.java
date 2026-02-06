package com.financial.financial_assistant.model.dto.mapper;

import com.financial.financial_assistant.model.entity.Account;
import com.financial.financial_assistant.model.dto.request.CreateAccountRequest;
import com.financial.financial_assistant.model.dto.response.AccountResponse;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {

    public Account toEntity(CreateAccountRequest request) {
        Account account = new Account();
        account.setName(request.getName());
        account.setCurrentBalance(request.getInitialBalance());
        account.setInitialBalance(request.getInitialBalance());
        account.setAccountType(request.getAccountType());
        account.setCurrency(request.getCurrency());
        account.setDescription(request.getDescription());
        return account;
    }

    public AccountResponse toResponse(Account account) {
        if (account == null) {
            return null;
        }

        AccountResponse response = new AccountResponse();
        response.setId(account.getId());
        response.setName(account.getName());
        response.setCurrentBalance(account.getCurrentBalance());
        response.setInitialBalance(account.getInitialBalance());
        response.setAccountType(account.getAccountType());
        response.setCurrency(account.getCurrency());
        response.setDescription(account.getDescription());
        response.setCreatedAt(account.getCreatedAt());
        response.setUpdatedAt(account.getUpdatedAt());

        return response;
    }

    public void updateEntity(Account account, CreateAccountRequest request) {
        if (request.getName() != null) {
            account.setName(request.getName());
        }
        if (request.getAccountType() != null) {
            account.setAccountType(request.getAccountType());
        }
        if (request.getCurrency() != null) {
            account.setCurrency(request.getCurrency());
        }
        if (request.getDescription() != null) {
            account.setDescription(request.getDescription());
        }
    }
}

