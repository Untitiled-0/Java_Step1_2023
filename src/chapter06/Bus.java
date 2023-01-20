package chapter06;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;

	// 디폴트 생성자
	// free complie

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	public void take(int money) { // 승객이 낸 돈
		this.money += money; // 버스의 수입증가
		passengerCount++; // 승객의 수
	}

	public void showInfo() {
		System.out.println("버스 " + busNumber + " 현재 승객은 : " + passengerCount + "명이고 수입은 : " + money + "원입니다.");
	}
}
