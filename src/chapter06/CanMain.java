package chapter06;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
		
		System.out.print("돈을 넣어주세요 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
			
		Vending ven = new Vending();
		ven.init();
		ven.showCans(num);
		
		System.out.println("===========");
		System.out.print("음료를 선택하세요 : ");
		String select = scan.next();
		ven.outCan(select);
		
	}
}
