package com.banking.transaction.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.banking.transaction.dto.TransactionDTO;
import com.banking.transaction.service.TransactionService;

@RestController
public class TransactionController {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	TransactionService transactionService;

	@PostMapping(value = "/transaction")
	public void saveTransaction(@RequestBody TransactionDTO transactionDTO) {

		transactionService.saveTransaction(transactionDTO);
	}

}
