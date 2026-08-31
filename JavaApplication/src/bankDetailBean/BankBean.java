package bankDetailBean;

public class BankBean {
	
	private int BankID;
	private String BankName;
	private String BankLoc;
	public int getBankID() {
		return BankID;
	}
	public void setBankID(int bankID) {
		BankID = bankID;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getBankLoc() {
		return BankLoc;
	}
	public void setBankLoc(String bankLoc) {
		BankLoc = bankLoc;
	}
	@Override
	public String toString() {
		return "BankBean [BankID=" + BankID + ", BankName=" + BankName + ", BankLoc=" + BankLoc + "]";
	}
	

}
