package com.test.workshop3.doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorTest {
    
    public static void main( String[] args ) {
        
        List<Dentist> dent = new ArrayList<Dentist>();
        List<Surgeon> surg = new ArrayList<Surgeon>();
        
        dent.add(new Dentist("홍길동"));
//        System.out.println(dent.get(0));
//        dent.get(0).treatPatient();
//        dent.get(0).pullOutTooth();
        dent.add(new Dentist("전우치"));
        
        surg.add(new Surgeon("임꺽정"));
        surg.add(new Surgeon("홍길순"));
        surg.add(new Surgeon("광개토"));
        
        //TODO 의사 정보 출력
        
//        Doctor doctor = new Doctor("이순신", "치과");
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