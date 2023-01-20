package chapter06;

import java.util.Scanner;

public class Vending {

	private Can[] can = new Can[5];
	private int money;

	public void init() {
		can[0] = new Can("환타", 1000);
		can[1] = new Can("콜라", 1200);
		can[2] = new Can("사이다", 1300);
		can[3] = new Can("스프라이트", 1400);
		can[4] = new Can("펩시", 1500);
	}

	public void showCans(int m) {
		money = m;
		for (int i = 0; i < can.length; i++) {
			if (can[i].getPrice() <= money) {
				System.out.println(can[i].getCanName() + "-" + can[i].getPrice()+"원");
			} else {
			}
		}
	}

//	public void outCan(String name) {
//		for (int i = 0; i < can.length; i++) {
//			System.out.println(can[i].getCanName());
//			System.out.println(name);
//			if (can[i].getCanName().equals(name)) {
//				System.out.println(can[i].getCanName() + "가 나왔습니다.");
//				System.out.println("잔 액 : "+(money-can[i].getPrice())+"원이 나왔습니다.");
//			}
//		}
//	}
	public void outCan(String name) {
		System.out.println(name);
		System.out.println(can[2].getCanName());
		for (int i = 0; i < can.length; i++) {
			if (can[i].getCanName()==name) {
				System.out.println(can[i].getCanName() + "를 선택하셨습니다.");
				System.out.println("잔 액 : "+(money-can[i].getPrice())+"원이 나왔습니다.");
			}
		}
	}
}
