package com.krystian;

public class Bank {

	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private long phoneNumber;
	

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public double withdrawFunds(double withdrawFunds) {
		double newFunds;
		if (getBalance() < withdrawFunds ) {
			System.out.println("Lacking funds " +(getBalance()-withdrawFunds) + "Funds is only " + getBalance());
		} else {
			newFunds = getBalance() - withdrawFunds;
			setBalance(newFunds);
			System.out.println("Remaining Balance is: " + newFunds);
		}
		return 0;
	}
	public void depositFunds(double funds) {
		double newFunds;
		newFunds = getBalance() + funds;
		setBalance(newFunds);
		System.out.println("New Balance is: " + newFunds);
	}

	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", balance=" + balance + ", customerName=" + customerName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
}
