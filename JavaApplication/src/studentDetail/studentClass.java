package studentDetail;

import java.util.Scanner;

public class studentClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudBean student = new StudBean();

        System.out.println("Enter student roll no:");
        student.setStudRollNo(sc.nextInt());

        System.out.println("Enter student name:");
        student.setStudName(sc.next());

        System.out.println("Enter fees:");
        student.setStudFees(sc.nextDouble());

        System.out.println("Student Roll No: " + student.getStudRollNo());
        System.out.println("Student Name: " + student.getStudName());
        System.out.println("Student Fees: " + student.getStudFees());

    }
}
