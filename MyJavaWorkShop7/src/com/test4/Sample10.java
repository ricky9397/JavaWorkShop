package com.test4;

class Database {
	void open() {
		System.out.println("Database open");
	}
}

class Oracle extends Database {
	void select_oracle() {
		System.out.println("Oracle select");
	}
	void open() {
		System.out.println("Oracle open");
	}
}

class Mysql extends Database {
	void select_mysql() {
		System.out.println("MySql select");
	}
	void open() {
		System.out.println("MySql open");
	}
}

class SqlServer extends Database {
	void select_sqlserver() {
		System.out.println("sqlserver select");
	}
	void open() {
		System.out.println("sqlserver open");
	}
}

public class Sample10 {
//	static void openDb(Database db) {
//		db.open();
//	}
	static Database CreateDatabase(String dbname) {
		Database db = null;
		switch(dbname) {
		case "Oracle":
			db = new Oracle();
			break;
		case "MySql":
			db = new Mysql();
			break;
		case "SqlServer":
			db = new SqlServer();
			break;
		}
		return db;
	}
	
	public static void main(String[] args) {
		// 참조형변환
//		Oracle db = new Oracle();
//		Database db2 = (Database)db;
//		
		// 다형성
//		Database db = new Oracle();
//		db.open();
//		Database db2 = new Mysql();
//		db2.open();
//		openDb(new Oracle());
//		openDb(new Mysql());
		
		// 이런식으로 함수를 가져오는게 좋다
		Database db = CreateDatabase("SqlServer");
		db.open();
//		Database db2 = CreateDatabase("MySql");

	}
}
