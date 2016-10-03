package com.transaction.test.dao;

public interface TransactionDAO {

	void saveTransaction(long accountId1, long accountId2, long amount);
}
