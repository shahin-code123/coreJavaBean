package simplebean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empbean emp= new Empbean();
		emp.setEmpid(101);
		emp.setEmpname("Alex");
		emp.setEmpsal(6737.45);
		
		System.out.println("EmpID: "+emp.getEmpid());
		System.out.println("Emp name: "+emp.getEmpname());
		System.out.println("Emp salary: "+emp.getEmpsal());

	}

}
