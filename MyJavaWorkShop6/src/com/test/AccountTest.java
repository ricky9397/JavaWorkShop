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
		System.out.println("���¹�ȣ:" + customer.getAccountNo());
		System.out.println("������ �̸�:" + customer.getAccountName());
		System.out.println("�ܾ�:" + customer.getBalance());

	}
	
	public static void main(String[] args) {
		Account customer1 = new Account("111-222-33333333", "������", 20000);
		Account customer2 = new Account("555-666-77777777", "���ſ�", 100000);
		System.out.println("�⺻ ������");
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("�ѹ��� �����");
		customer1.deposit(1000000);
		customer2.withdraw(30000);
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("�������� ���");
		Account.interest = 0.05;
		customer1.addInterest(); //����� �ݾ�=����+����*������
		customer2.addInterest();//����� �ݾ�=����+����*������
		printAccount(customer1);
		printAccount(customer2);
		
	}
}
