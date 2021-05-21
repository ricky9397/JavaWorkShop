package com.test.workshop3.account;

import com.test.workshop3.exception.InvalidValueException;

public class Account {
    
    private String account;
    private String name;
    private int    balance;
    
    public Account(String account, String name, int balance) throws InvalidValueException {
        //TODO ���� �Ա� �ݾ��� 0�� ������ ���, ���� �߻�
    	if(balance <= 0) {
    		throw new InvalidValueException("[����] ���� ���� ��, ���� �Ա� �ݾ��� �ʿ��մϴ�");
    	}
        this.account = account;
        this.name    = name;
        this.balance = balance;
    }
    
    public void deposit(int money) throws InvalidValueException {
        //TODO �Ա��� �ݾ��� �߸� �Էµ� ���, ���� �߻�
    	if(money <= 0) {
    		throw new InvalidValueException("[����] �Ա��� �ݾ��� 0�� �ʰ��� ���ڷ� �Է��ϼ���.");
    	}
        balance += money;
    }
    
    public void withdraw(int money) throws InvalidValueException {
        //TODO ����� �ݾ��� �߸� �ԷµǾ��ų�, �ܾ��� ������ ��� ���� �߻�
    	if(money <= 0) {
    		throw new InvalidValueException("[����] ����� �ݾ��� 0�� �ʰ��� ���ڷ� �Է��ϼ���");
    	}
        balance -= money;
    }
    
    @Override
    public String toString() {
        return "[����] " + account + "\t[������] " + name + "\t[�ܾ�] " + balance;
    }
}