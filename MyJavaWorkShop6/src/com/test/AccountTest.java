package com.test;

class Account {

	public static double interest;
	private String accountNo;
	private String accountName;
	private double balance;
	

	Account(String accountNo, String accountName, double Balance) {
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = Balance;
	}
	
	public String getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}




	public void deposit(double i) {
		this.balance += i;
		
	}


	public void withdraw(double i) {
		this.balance -= i;
	}


	public void addInterest() {
		this.balance += balance * interest;
	}
}

public class AccountTest {

	static void printAccount(Account customer) {
		System.out.println("계좌번호:" + customer.getAccountNo());
		System.out.println("예금주 이름:" + customer.getAccountName());
		System.out.println("잔액:" + customer.getBalance());

	}
	
	public static void main(String[] args) {
		Account customer1 = new Account("111-222-33333333", "최은희", 20000);
		Account customer2 = new Account("555-666-77777777", "남매월", 100000);
		System.out.println("기본 적립금");
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("한번의 입출금");
		customer1.deposit(1000000);
		customer2.withdraw(30000);
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("이자율의 계산");
		Account.interest = 0.05;
		customer1.addInterest(); //저축된 금액=원금+원금*이자율
		customer2.addInterest();//저축된 금액=원금+원금*이자율
		printAccount(customer1);
		printAccount(customer2);
		
	}
}
