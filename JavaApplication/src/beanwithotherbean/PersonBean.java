package beanwithotherbean;

public class PersonBean {
	
/*bean with other bean
 * aggregation relationship
 * indirect relationship
 * has a relationship
 * wrapper class
 */
	
	private int pid;
	private String pname;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "PersonBean [pid=" + pid + ", pname=" + pname + "]";
	}
	
	
}
