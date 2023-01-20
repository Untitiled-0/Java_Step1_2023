package chapter06;

public class StudentInfo {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.studentName="김치";
		student1.address="서울";
		
		// 메소드를 이용해서 
		student1.showStudentInfo();
		
		Student student2 = new Student();
		
		student2.setStudentName("박수");
		student2.setAddress("경기도");
		
		student2.showStudentInfo();
	
		//생성자 오버로딩으로 set 
		
		Student student3 = new Student("김치즈", "서울시 은평구");
		student3.showStudentInfo();
	
	
	}
}
