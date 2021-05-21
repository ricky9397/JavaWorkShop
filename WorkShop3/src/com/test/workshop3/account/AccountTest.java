package com.test.workshop3.account;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.security.auth.login.AccountNotFoundException;

import com.test.workshop3.exception.InvalidValueException;

public class AccountTest {    
    public static void main( String[] args ) {        
        int menu  = 0;
        Account acc = null;
        
        while ( menu != 9 ) {            
            printMenu();            
            try {     
            	String account;
            	String name;
            	int balance;
            	int money = 0;
                menu = Integer.parseInt(getUserInput());                
                //TODO �� �޴� ���� �� �ؾ� �� �� ����
                switch ( menu ) {
                case 1:     // ���� ����
                	System.out.print( "\n���¹�ȣ : " );
                	account = getUserInput();
                    System.out.print( "������ : " );
                    System.out.println();
                    name = getUserInput();
                    System.out.print( "���� �Ա� : " );
                    balance = Integer.parseInt(getUserInput());
                    acc = new Account(account, name, balance);
                    break;
                case 2:     // ���� ���� ���
                	if(acc == null) {
                		throw new AccountNotFoundException("[����] ���°� �����ϴ�.");
                	} else {
                		System.out.println(acc);
                	}
                	break;
                case 3:     // �Ա�
                    System.out.print( "�Ա��� �ݾ� : " );
                    money = Integer.parseInt(getUserInput());
                    acc.deposit(money);
                    break;
                case 4:     // ���
                    System.out.print( "����� �ݾ� : " );
                    money = Integer.parseInt(getUserInput());
                    acc.withdraw(money);
                    break;
                case 9:     // ����
                    System.out.println( "�����մϴ�." );
                    break;
                default:
                    System.out.println( "[����] �޴��� �߸� �Է��Ͽ����ϴ�." );
                    break;
                }
                
                //TODO catch ����ȭ (������ ���� ��Ȳ ����)
            } catch(AccountNotFoundException e) {
            	System.out.println(e.getMessage());
            } catch (InvalidValueException e) {
            	System.out.println(e.getMessage());
            } catch(NumberFormatException e) {
            	System.out.println("[����] �޴��� ���ڷ� �Է��ؾ� �մϴ�.");
            } catch ( Exception e ) {
                
            }
        }
    }
    
    private static Account deposit() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void printMenu() {
        System.out.println( "\n===== < �޴� > =====" );
        System.out.println( " 1. ���� ����" );
        System.out.println( " 2. ���� ���� ���" );
        System.out.println( " 3. �Ա�" );
        System.out.println( " 4. ���" );
        System.out.println( " 9. ����" );
        System.out.println( "===================" );
        System.out.print( ">> �޴� : " );
    }
    
    public static String getUserInput() {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = null;
        
        try {
            inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        return inputString;
    }
}