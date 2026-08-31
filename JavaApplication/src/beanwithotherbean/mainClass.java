package beanwithotherbean;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);

		PersonBean p= new PersonBean();
		System.out.println("Enter person id..");
		p.setPid(sc.nextInt());
		
		System.out.println("Enter person name:");
		p.setPname(sc.next());
		
		System.out.println("Person Id: "+p.getPid());
		System.out.println("Person name: "+p.getPname());
        
		profBean pr = new profBean();
		
		System.out.println("Enter professor id:");
		pr.setProfid(sc.nextInt());
		
		System.out.println("Enter professor name..");
		pr.setProfname(sc.next());
		pr.setPb(p);
		
		//p is object of person
		
		System.out.println("Prof Id: "+pr.getProfid());
		System.out.println("Prof name:"+pr.getProfname());
		System.out.println(pr.getPb());
	}

}

/*
bankBean
bankId
bank name
bankLoc

AccountBean: Bank bean should be declared as variable
AcctId
AccName

CustomerBean: bankbean shuold be declared as variable
CustId
CustName
Bank_bal
*/
