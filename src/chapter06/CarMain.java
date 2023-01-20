package chapter06;

import javax.swing.JOptionPane;

public class CarMain {

	public static void main(String[] args) {

		Car myCar = new Car();
		System.out.printf("제작회사 : %s\n모델명 : %s\n색깔 : %s\n최고속도 : %d\n현재속도 : %d\n", myCar.company, myCar.model, myCar.color,
				myCar.maxSpeed, myCar.Speed);
		myCar.Speed = 60;
		System.out.println("-----------------------");
		System.out.println("변경된 현재속도 : " + myCar.Speed);
	}
}
