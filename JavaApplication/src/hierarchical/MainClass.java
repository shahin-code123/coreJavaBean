package hierarchical;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		
		Deparment d=new Deparment();
		System.out.println("Enter dept id:");
		d.setDeptid(sc.nextInt());
		System.out.println("enter dept name:");
		d.setDeptname(sc.next());
		
		Student s=new Student();
		System.out.println("stud id:");
		s.setStudID(sc.nextInt());
		System.out.println("enter stud name:");
		s.setStudName(sc.next());
		System.out.println("college id:");
		s.setCollid(sc.nextInt());
		System.out.println("col name:");
		s.setCname(sc.next());
		System.out.println("college location:");
		s.setColoc(sc.next());
		
		professor p=new professor();
		System.out.println("professor id:");
		p.setProfid(sc.nextInt());
		System.out.println("prof name:");
		p.setProfName(sc.next());
		
		System.out.println("College ID:-"+s.getCollid());
		System.out.println("College name:-"+s.getCname());
		System.out.println("College Loc:-"+s.getColoc());
		System.out.println("----------------------------");
		System.out.println("Department ID:-"+d.getDeptid());
		System.out.println("Department Name:-"+d.getDeptname());
		System.out.println("----------------------------");
		System.out.println("Student ID:-"+s.getStudID());
		System.out.println("Student Name:-"+s.getStudName());
		System.out.println("----------------------------");
		System.out.println("Professor ID:-"+p.getProfid());
		System.out.println("professor name:-"+p.getProfName());
		
		
		
		
				
		

	}

}
