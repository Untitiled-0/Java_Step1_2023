package chapter06.EX;

import java.util.Scanner;

public class BaseballGame {

	Baseball bb = new Baseball();
	private String check = "";

	public String check() {
		
		bb.init();
		Scanner sc = new Scanner(System.in);
		while (true) {
			
			System.out.println("=======================");
			System.out.println(" 1~9 사이의 수를 입력하세요 ");
			System.out.print("첫번째 수를 입력하세요 : ");
			bb.user1 = sc.nextInt();
			System.out.print("두번째 수를 입력하세요 : ");
			bb.user2 = sc.nextInt();
			System.out.print("세번째 수를 입력하세요 : ");
			bb.user3 = sc.nextInt();
			
			int strike = 0;
			int ball = 0;

			if (bb.user1 == bb.com1) {
				strike++;
			} else if (bb.user1 == bb.com2 || bb.user1 == bb.com3) {
				ball++;
			}

			if (bb.user2 == bb.com2) {
				strike++;
			} else if (bb.user2 == bb.com1 || bb.user2 == bb.com3) {
				ball++;
			}
			if (bb.user3 == bb.com3) {
				strike++;
			} else if (bb.user3 == bb.com1 || bb.user3 == bb.com2) {
				ball++;
			}
			if (strike == 3) {
				check="WIN";
				System.out.println("정답!! - " + bb.com1 + bb.com2 + bb.com3);
			} else {
				if (strike > 0 || ball > 0) {
					System.out.println(strike + " Strike");
					System.out.println(ball + " Ball");
				} else {
					System.out.println("OUT");
				}
			}
		}
	}
}
