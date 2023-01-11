package chapter07;

public class CarMain {

	public static void main(String[] args) {
		
		// 객체 생성자를 통하여 초기화
		Car myCar = new Car("검정",3000);
		//멤버변수이용하여 하나씩 초기화
//		myCar.color;
		// 멤버변수에 직접 접근해서 출력
//		System.out.println("color"+myCar.color);
		
		System.out.println();
		//메서드를 이용한 출력
//		System.out.println(myCar.getCc());
		
	}
}
