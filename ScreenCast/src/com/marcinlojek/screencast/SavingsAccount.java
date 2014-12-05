package com.marcinlojek.screencast;

public class SavingsAccount {

	private int balance = 0;
	public void deposit(int ammount) {
		this.balance += ammount;
	}

	public int balance() {
		return this.balance;
	}

	public void withdraw(int ammount) {
		this.balance -= ammount;
	}

	
	
}
