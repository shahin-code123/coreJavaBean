package singleLevel;

public class College {
	
	//parent class called always first class
	//Parent will never have java main method
	//inheritance protected we are using in child class
	
protected int colid;
protected String cname;
protected String coloc;
public int getColid() {
	return colid;
}
public void setColid(int colid) {
	this.colid = colid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getColoc() {
	return coloc;
}
public void setColoc(String coloc) {
	this.coloc = coloc;
}

}
