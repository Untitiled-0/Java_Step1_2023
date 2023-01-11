package chapter06;

import javax.swing.JOptionPane;

public class Student {

	int studentID;
	public String studentName;
	int grade;
	String address;

	//디폴트 생성자( free complie )
	// 오버로딩된 생성자가 있을 시 디폴트를 사용하기 위해서는 반드시 
	// 생략이 불가능하다.

	public Student() { // 이럴때는 꼭 보여줘야한다.
		
	}
	public Student(String studentName, String address) {
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
