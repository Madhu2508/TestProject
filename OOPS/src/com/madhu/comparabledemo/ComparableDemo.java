package com.madhu.comparabledemo;

import java.util.ArrayList;
import java.util.Collections;


public class ComparableDemo {

	public static void main(String[] args) {

		ArrayList<Student> list= new ArrayList<Student>();
		Student s1= new Student(1, "Suraj", "Pune");
		Student s2= new Student(2, "Shrija", "Mumbai");
		Student s3= new Student(3, "Rohit", "Rajgurunagar");
		s1.setName("Madhu");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Collections.sort(list);
		System.out.println("After sorting by name:");
		
		for(Student s: list) {
			System.out.println(s.getId()+":"+s.getName()+":"+s.getAddress());
		}
		Collections.reverse(list);
		
		System.out.println();
        System.out.println("Reverse of list:");
		
		for(Student s: list) {
			System.out.println(s.getId()+":"+s.getName()+":"+s.getAddress());
		}
	}

}
