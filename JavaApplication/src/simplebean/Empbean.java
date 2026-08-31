package simplebean;

public class Empbean {
/*
 * java beans is concept where we store vaLUES inside the variables indirectly with the 
 * help of setter getter method 
 * 
 * 
 * setter method: is used to store values inside the variable 
 * getter method: is used to get or print values from the variable 
 *  
 * setter method : method with parameter 
 * getter method : method without void
 * 
 * java beans make the code more secured 
 * java beans ko private rakhna and globle rakhna
 * this keyword is used to share value of parameter with private variable	
 */

	// Private variables
    private int empid;
    private String empname;
    private double empsal;


    // Setter method for empid
    public void setEmpid(int id) {
        this.empid = id;
    }

    // Getter method for empid
    public int getEmpid() {
        return empid;
    }

    // Setter method for empname
    public void setEmpname(String name) {
        this.empname = name;
    }

    // Getter method for empname
    public String getEmpname() {
        return empname;
    }

    // Setter method for empsal
    public void setEmpsal(double sal) {
        this.empsal = sal;
    }

    // Getter method for empsal
    public double getEmpsal() {
        return empsal;
    }
}

/*
StudBean
Studrollno
studname
studfees

package name devicedetails
deviceBean
deviceid
deviceName
deviceOS
kernalVersion
Manf_date
IMEI_Code
RAM_Details
password 
confirm password
*/