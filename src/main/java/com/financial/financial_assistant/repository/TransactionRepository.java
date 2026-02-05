package com.financial.financial_assistant.repository;

import com.financial.financial_assistant.model.entity.Transaction;
import com.financial.financial_assistant.model.enums.TransactionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    Page<Transaction> findByUserId(Long userId, Pageable pageable);

    @Query("SELECT t FROM Transaction t WHERE t.user.id = :userId AND t.date BETWEEN :startDate AND :endDate")
    List<Transaction> findByUserIdAndDateBetween(@Param("userId") Long userId,
                                                 @Param("startDate") LocalDate startDate,
                                                 @Param("endDate") LocalDate endDate);

    @Query("SELECT t FROM Transaction t WHERE t.user.id = :userId AND t.date BETWEEN :startDate AND :endDate AND t.type = :type")
    List<Transaction> findByUserIdAndDateBetweenAndType(@Param("userId") Long userId,
                                                        @Param("startDate") LocalDate startDate,
                                                        @Param("endDate") LocalDate endDate,
                                                        @Param("type") TransactionType type);

    @Query("SELECT COALESCE(SUM(t.amount), 0) FROM Transaction t WHERE t.user.id = :userId AND t.type = :type AND t.date BETWEEN :startDate AND :endDate")
    BigDecimal getTotalAmountByUserAndTypeAndDateBetween(@Param("userId") Long userId,
                                                         @Param("type") TransactionType type,
                                                         @Param("startDate") LocalDate startDate,
                                                         @Param("endDate") LocalDate endDate);
}
