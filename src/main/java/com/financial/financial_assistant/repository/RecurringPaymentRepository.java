package com.financial.financial_assistant.repository;

import com.financial.financial_assistant.model.entity.RecurringPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecurringPaymentRepository extends JpaRepository<RecurringPayment, Long> {
    List<RecurringPayment> findByUserId(Long userId);
    List<RecurringPayment> findByUserIdAndIsActiveTrue(Long userId);
}