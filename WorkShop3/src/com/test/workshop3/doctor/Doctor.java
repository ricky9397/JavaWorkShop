package com.test.workshop3.doctor;

public class Doctor {
    
    private String name;
    private String department;
    
    public Doctor( String name, String department ) {
        this.name = name;
        this.department = department;
    }
    
    public void treatPatient() {
        System.out.println( "ȯ�ڸ� �����մϴ�." );
    }
    
    @Override
    public String toString() {
        return department + " : " + name + " ������";
    }
}