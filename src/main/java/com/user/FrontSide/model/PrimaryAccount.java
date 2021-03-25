package com.user.FrontSide.model;

import java.math.BigDecimal;
import java.util.List;

public class PrimaryAccount {
	private Long id;
	private int accountNumber;
	private BigDecimal accountBalance;
	
	private List<PrimaryTransaction> primaryTranactionList;

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

	public List<PrimaryTransaction> getPrimaryTranactionList() {
		return primaryTranactionList;
	}

	public void setPrimaryTranactionList(List<PrimaryTransaction> primaryTranactionList) {
		this.primaryTranactionList = primaryTranactionList;
	}
	
	

}
