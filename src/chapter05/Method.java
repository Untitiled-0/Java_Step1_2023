package chapter05;

import java.util.Scanner;

public class Method { // object
	Scanner sc = new Scanner(System.in);

	int input, bread_cnt;
	void makeBread() {
		System.out.println("빵을 만듭니다.");
	}

	void makeBread(int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%d번째 빵을 만들었습니다.\n", i + 1);
		}
		System.out.printf("요청하신 %d개의 빵이 모두 완료되었습니다.  \n", cnt);
	}

	void makeBread(int cnt, String str) {
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%d번째 %s빵을 만들었습니다.\n", i + 1, str);
		}
		System.out.printf("요청하신 %d개의 %s빵이 모두 완료되었습니다.  \n", cnt, str);
	}

	void make(int cnt) {
		if (cnt < 0) {

		} else {
			for (int i = 0; i < cnt; i++) {
				System.out.printf("%d번째 빵을 만들었습니다.\n", i + 1);
			}
			System.out.printf("요청하신 %d개의 빵이 모두 완료되었습니다.  \n", cnt);
		}
	}

	void make(int cnt, String name) {
		if (cnt < 0) {

		} else {
			for (int i = 0; i < cnt; i++) {
				System.out.printf("%d번째 %s빵을 만들었습니다.\n", i + 1, name);
			}
			System.out.printf("요청하신 %d개의 %s빵이 모두 완료되었습니다.  \n", cnt, name);
		}
	}

	void order() {

		Method bread = new Method();
		boolean run = true;
		int input, bread_cnt;
		String bread_name = "";


		while (run) {
			System.out.println();
			System.out.println("1. 빵의 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종료 ");
			System.out.print("선택 > ");
			input = sc.nextInt();

			if (input == 1) {
				System.out.print("주문할 빵의 갯수 : ");
				bread_cnt = sc.nextInt();
				if (bread_cnt < 0) {
					System.out.println("잘못된 갯수입니다.");
				}
				bread.make(bread_cnt);
			} else if (input == 2) {
				System.out.print("주문할 빵의 갯수 : ");
				bread_cnt = sc.nextInt();
				if (bread_cnt < 0) {
					System.out.println("잘못된 갯수입니다.");
				} else {
					System.out.print("주문할 빵의 종류 : ");
					bread_name = sc.next();
					bread.make(bread_cnt, bread_name);
				}
			} else if (input == 3) {
				run = false;
				System.out.println("프로그램 종료");
			} else {
				System.out.println("잘못된 숫자입니다. ");
			}
		}
	}
}
