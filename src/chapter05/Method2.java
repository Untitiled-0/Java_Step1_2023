package chapter05;

import java.util.Scanner;

public class Method2 extends Method{ // object

	int cnt, num;
	boolean run = true;
	int input, bread_cnt;
	String bread_name = "";
//	Method br = new Method();
	
	Scanner sc = new Scanner(System.in);
	
//	public Method2() {
//	}
	void order() {
		while(run){
			System.out.println();
			System.out.println("1. 빵의 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종료 ");
			System.out.print("선택 > ");
			
			num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.print("주문할 빵의 갯수 : ");
				bread_cnt = sc.nextInt();
				if (bread_cnt < 0) {
					System.out.println("잘못된 갯수입니다.");
				}
				makeBread(bread_cnt);
				break;
			case 2:
				System.out.print("주문할 빵의 갯수 : ");
				bread_cnt = sc.nextInt();
				if (bread_cnt < 0) {
					System.out.println("잘못된 갯수입니다.");
				} else {
					System.out.print("주문할 빵의 종류 : ");
					bread_name = sc.next();
					makeBread(bread_cnt, bread_name);
				}
				break;
			case 3:
				run = false;
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 숫자입니다. ");
				break;
			}
		}
	}	
}
