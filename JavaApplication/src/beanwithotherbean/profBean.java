package beanwithotherbean;

public class profBean {
	//one class is declared 
	
	private int profid;
	private String Profname;
	private PersonBean pb;
	public int getProfid() {
		return profid;
	}
	public void setProfid(int profid) {
		this.profid = profid;
	}
	public String getProfname() {
		return Profname;
	}
	public void setProfname(String profname) {
		Profname = profname;
	}
	public PersonBean getPb() {
		return pb;
	}
	public void setPb(PersonBean pb) {
		this.pb = pb;
	}

}
