package com.banking.transaction.service;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.transaction.dto.TransactionDTO;
import com.banking.transaction.entity.Transaction;
import com.banking.transaction.repository.TransactionRepository;

@Service
public class TransactionService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	TransactionRepository transactionRepository;

	public void saveTransaction(TransactionDTO transactionDTO) {

		logger.info("Update transaction request, inside Service. RequestBody : ", transactionDTO);

		Transaction transaction = transactionDTO.createEntity();

		transactionRepository.save(transaction);
	}
}
