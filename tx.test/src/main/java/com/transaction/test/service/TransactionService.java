package com.transaction.test.service;

import com.transaction.test.dao.AccountDAO;
import com.transaction.test.dao.TransactionDAO;

public class TransactionService {

	private AccountDAO accountDAO;
	private TransactionDAO transactionDAO;
	
	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
	
	public void setTransactionDAO(TransactionDAO transactionDAO) {
		this.transactionDAO = transactionDAO;
	}
	
	public void makeTransfer(long accountId1, long accountId2, long amount){
		if(accountId1<0){
			throw new IllegalArgumentException("Wrong account1");
		}
		
		if(accountId2<0){
			throw new IllegalArgumentException("Wrong account2");
		}
		
		if(amount<0){
			throw new IllegalArgumentException("amount can’t be negative");
		}
		
		long balance = accountDAO.getAccountBalance(accountId1);
		
		if(balance<amount){
			throw new UnsupportedOperationException("account balance is less than amount, credit not available");
		}
		
		transactionDAO.saveTransaction(accountId1, accountId2, amount);
	}
}
