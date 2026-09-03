package hierarchical;
public class Deparment extends college {
		
		//extends keywords is use to share all details program 
		//of parent class will child class
		
		protected int Deptid;
		protected String Deptname;
		public int getDeptid() {
			return Deptid;
		}
		public void setDeptid(int deptid) {
			Deptid = deptid;
		}
		public String getDeptname() {
			return Deptname;
		}
		public void setDeptname(String deptname) {
			Deptname = deptname;
		}

	


}
