package chapter06;

import javax.swing.JOptionPane;

public class StudentMain {

	int studentID;
	private String studentName;
	int grade;
	String address;

	// free complie
	// 오버로딩

	public StudentMain(String studentName,String address) {
		this.studentName = studentName;
		this.address = address;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}

}
