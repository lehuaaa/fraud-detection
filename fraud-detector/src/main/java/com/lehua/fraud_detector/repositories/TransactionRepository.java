package com.lehua.fraud_detector.repositories;


import com.lehua.fraud_detector.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, String> { }