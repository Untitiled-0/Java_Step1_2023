package chapter06;

public class StdInfo {
	public String studentName;
	public int grade;
	public int money;

	// 디폴트 생략 free complie

	// 생성자 오버로딩

	public StdInfo(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	// 버스

	
	public void takeBus(Bus bus) { // 내가만든것도 클래스이므로 사용할 수 있다.
		bus.take(1000);
		this.money -= 1000; // 내입장에서는 돈이 나가야함
	}
	public void takeSubway(Subway subway) { // 내가만든것도 클래스이므로 사용할 수 있다.
		subway.take(1000);
		this.money -= 1000; // 내입장에서는 돈이 나가야함
	}

	public void showInfo() {
		System.out.println(studentName + "님의 남은 잔액은 : " + money + "원 입니다.");
	}



}
