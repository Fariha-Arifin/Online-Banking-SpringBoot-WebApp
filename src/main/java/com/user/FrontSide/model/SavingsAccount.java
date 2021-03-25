package com.user.FrontSide.model;

import java.math.BigDecimal;
import java.util.List;

public class SavingsAccount {
	
	private Long id;
	private int accountNumber;
	private BigDecimal accountBalance;
	
	private List<SavingsTransaction> savingsTranactionList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public List<SavingsTransaction> getSavingsTranactionList() {
		return savingsTranactionList;
	}

	public void setSavingsTranactionList(List<SavingsTransaction> savingsTranactionList) {
		this.savingsTranactionList = savingsTranactionList;
	}
	
	


}
