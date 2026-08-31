package devicedetails;

import java.util.Scanner;

public class deviceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		deviceBean device = new deviceBean();
		
		System.out.println("Enter your device id:");
		device.setdeviceId(sc.nextInt());
		
		System.out.println("Enter you device name:");
		device.setdeviceName(sc.next());
		
		System.out.println("Enter your deviceOS:");
		device.setdeviceOS(sc.next());
		
		System.out.println("Enter your kernal version:");
		device.setkernalVersion(sc.next());
		
		System.out.println("Enter your manufacture Date:");
		device.setManf_date(sc.next());
		
		System.out.println("Enter your Ram");
		device.setRAM_Detail(sc.next());
		
		System.out.println("Enter your IMEI_Code: ");
		device.setIMEI_Code(sc.nextLong());
		
		System.out.println("Enter your password:");
		device.setpassword(sc.next());
		
		System.out.println("Enter your confirm password:");
		device.setconfirmpassword(sc.next());
		
		if(device.getpassword().equals(device.getconfirmpassword()))
		{
		
		
		    System.out.println("Device id : "+device.getdeviceId());
		    System.out.println("Device name: "+device.getdeviceName());
		    System.out.println("Device OS: "+device.getdeviceOS());
		    System.out.println("Device kernal version: "+device.getkernalVersion());
		    System.out.println("manufacture Date: "+device.getManf_Date());
		    System.out.println("Ram: "+device.getRAM_Detail());
		    System.out.println("Device IMEI_Code: "+device.getIMEI_Code());
		    System.out.println("password: "+device.getpassword());
		    System.out.println("Confirm password: "+device.getconfirmpassword());
		}
		else
		{
			System.out.println("Password entered incorrect please re try..");
			System.out.println("Enter your password:");
			device.setpassword(sc.next());
			
			System.out.println("Enter your confirm password:");
			device.setconfirmpassword(sc.next());
			
		}
		if(device.getpassword().equals(device.getconfirmpassword()))
		{
			System.out.println("password is correct...");
		}
		
	}

}
