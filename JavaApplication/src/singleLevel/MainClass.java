package singleLevel;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dept d=new Dept();
		d.setColid(10);
		d.setCname("Apmit");
		d.setColoc("mumbai");
		d.setDeptid(190);
		d.setDeptname("campus");
		
		System.out.println("College ID:-"+d.getColid());
		System.out.println("College name:-"+d.getCname());
		System.out.println("College Loc:-"+d.getColoc());
		
		System.out.println("Department ID:-"+d.getDeptid());
		System.out.println("Department Name:-"+d.getDeptname());
		

	}

}
