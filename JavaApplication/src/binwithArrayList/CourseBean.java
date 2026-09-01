package binwithArrayList;

public class CourseBean {
	
	private int courseid;
	private String coursename;
	private double coursefees;
	
	//grouping me value store karna arraylist
	//hasnext use for conditon
	//array (A[]={1,2,4,34}
	
	//Parameterize constructor is acting like a setter method
	CourseBean(int id,String name, double fees)
	{
		this.courseid=id;
		this.coursename=name;
		this.coursefees=fees;
		
	}
	//toString is acting like a getter method 

	@Override
	public String toString() {
		return "CourseBean [courseid=" + courseid + ", coursename=" + coursename + ", coursefees=" + coursefees + "]";
	}
	

}
