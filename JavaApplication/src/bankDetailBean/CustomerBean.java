package bankDetailBean;

public class CustomerBean {
	private int CustId;
	private String CustName;
	private int Bank_Bal;
	private BankBean Bb;
	public int getCustId() {
		return CustId;
	}
	public void setCustId(int custId) {
		CustId = custId;
	}
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public int getBank_Bal() {
		return Bank_Bal;
	}
	public void setBank_Bal(int bank_Bal) {
		Bank_Bal = bank_Bal;
	}
	public BankBean getBb() {
		return Bb;
	}
	public void setBb(BankBean bb) {
		Bb = bb;
	}
	

}
