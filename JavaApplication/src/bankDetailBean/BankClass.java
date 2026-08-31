package bankDetailBean;

import java.util.Scanner;

public class BankClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		BankBean B = new BankBean();
		
		System.out.println("Enter Bank Id:");
		B.setBankID(sc.nextInt());
		
		System.out.println("Enter Bank name :");
		B.setBankName(sc.next());
		
		System.out.println("Enter bank location:");
		B.setBankLoc(sc.next());
		
		System.out.println("Bank Id:"+B.getBankID());
		System.out.println("Bank Name:"+B.getBankName());
		System.out.println("Bank Location:"+B.getBankLoc());
		
		AccountBean AB = new AccountBean();
		
		System.out.println("Enter your Account Id:");
		AB.setAccId(sc.nextInt());
		
		System.out.println("Enter your Account Name:");
		AB.setAccName(sc.next());
		AB.setBb(B);
		
		System.out.println("Account id:"+AB.getAccId());
		System.out.println("Account name:"+AB.getAccName());
		System.out.println(AB.getBb());
		
		CustomerBean Cb = new CustomerBean();
		
		System.out.println("Enter customer id:");
		Cb.setCustId(sc.nextInt());
		
		System.out.println("Enter Customer name:");
		Cb.setCustName(sc.next());
		
		System.out.println("bank balance:");
		Cb.setBank_Bal(sc.nextInt());
		Cb.setBb(B);
		
		System.out.println("Customer id:"+Cb.getCustId());
		System.out.println("Customer name:"+Cb.getCustName());
		System.out.println("Bank balance:"+Cb.getBank_Bal());
		System.out.println(Cb.getBb());

	}

}
