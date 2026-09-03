package multiLevel;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		
		Student S=new Student ();
		
		System.out.println("Enter College ID:-");
		S.setColid(sc.nextInt());
		System.out.println("Enter college name:-");
		S.setCname(sc.next());
		System.out.println("Enter location:-");
		S.setColoc(sc.next());
		System.out.println("Enter Department ID:-");
		S.setDeptid(sc.nextInt());
		System.out.println("Enter Department name :-");
		S.setDeptname(sc.next());
		System.out.println("Enter Student ID:-");
		S.setStudID(sc.nextInt());
		System.out.println("Enter Student name:-");
		S.setStudName(sc.next());
		
		System.out.println("College ID:-"+S.getColid());
		System.out.println("College name:-"+S.getCname());
		System.out.println("College Loc:-"+S.getColoc());
		
		System.out.println("Department ID:-"+S.getDeptid());
		System.out.println("Department Name:-"+S.getDeptname());
		
		System.out.println("Student ID:-"+S.getStudID());
		System.out.println("Student Name:-"+S.getStudName());
		

	}

}
