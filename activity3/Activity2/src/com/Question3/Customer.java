package com.Question3;

public class Customer {
	private int AccountNo;				//making properties as private
	private String Name;
	private double balance;
	private float withdrwamt;
	
	public int getAccountNo() {				
		return AccountNo;
	}
	public void setAccountNo(int accountNo) {
		AccountNo = accountNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
		if(balance>withdrwamt)			
		{
			balance=balance-withdrwamt;				//withdrawing amount
		}
	}
	public float getWithdrwamt() {
		return withdrwamt;
	}
	public void setWithdrwamt(float withdrwamt) {
		this.withdrwamt =withdrwamt;
		
		
	}

}
