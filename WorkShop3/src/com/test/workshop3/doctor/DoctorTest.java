package com.test.workshop3.doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorTest {
    
    public static void main( String[] args ) {
        
        List<Dentist> dent = new ArrayList<Dentist>();
        List<Surgeon> surg = new ArrayList<Surgeon>();
        
        dent.add(new Dentist("ȫ�浿"));
//        System.out.println(dent.get(0));
//        dent.get(0).treatPatient();
//        dent.get(0).pullOutTooth();
        dent.add(new Dentist("����ġ"));
        
        surg.add(new Surgeon("�Ӳ���"));
        surg.add(new Surgeon("ȫ���"));
        surg.add(new Surgeon("������"));
        
        //TODO �ǻ� ���� ���
        
//        Doctor doctor = new Doctor("�̼���", "ġ��");
//        System.out.println(doctor);
//        Object o = doctor;
//        System.out.println(o.toString());
        
        for(Dentist a : dent) {
        	System.out.println(a);
        	a.treatPatient();
        	a.pullOutTooth();
        	System.out.println();
        }
        
        for(Surgeon b : surg) {
        	System.out.println(b);
        	b.treatPatient();
        	b.performSurgery();
        	System.out.println();
        }
        
    }
}