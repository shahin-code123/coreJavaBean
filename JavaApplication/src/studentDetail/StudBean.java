package studentDetail;

public class StudBean {

    private int studRollNo;
    private String studName;
    private double studFees;

    // Setter method for Roll No
    public void setStudRollNo(int rollno) {
        this.studRollNo = rollno;
    }

    // Getter method for Roll No
    public int getStudRollNo() {
        return studRollNo;
    }

    // Setter method for Name
    public void setStudName(String name) {
        this.studName = name;
    }

    // Getter method for Name
    public String getStudName() {
        return studName;
    }

    // Setter method for Fees
    public void setStudFees(double fees) {
        this.studFees = fees;
    }

    // Getter method for Fees
    public double getStudFees() {
        return studFees;
    }
}
