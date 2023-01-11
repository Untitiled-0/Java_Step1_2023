package chapter06;

public class Subway {

	public String lineNumber;
	int passengerCount;
	int money;

	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) { // 승객이 낸 돈
		this.money += money; // 지하철의 수입증가
		passengerCount++; // 승객의 수
	}

	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "의 승객은 : " + passengerCount + "명이고 수입은 : " + money + "원입니다.");
	}
}
