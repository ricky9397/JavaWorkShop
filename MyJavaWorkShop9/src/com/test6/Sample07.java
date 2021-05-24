package com.test6;

interface IDatabase {
	public void open();
}

abstract class Database implements IDatabase {
	@Override
	public void open() {
		System.out.println("Database open");
	}
	abstract void select();	// 추상메서드
}

class Oracle extends Database {
	@Override 
	public void select() {
		System.out.println("Oracle open");
	}
}

public class Sample07 {
	public static void main(String[] args) {
		IDatabase db = new Oracle();
		db.open();
		Database db2 = new Oracle();
		db2.select();
		db2.select();
	}
}
