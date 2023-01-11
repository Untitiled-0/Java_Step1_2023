package chapter06;

import java.util.Scanner;

public class UpDownGameMain {

	public static void main(String[] args) {

		String check;
		UpDownGame obj = new UpDownGame();
		int in;
		Scanner scan = new Scanner(System.in);

		do{
			System.out.print("1 ~ 51사이의 숫자를 입력하세요. ");
			in = scan.nextInt();
		} while (obj.check(in).equals("FAIL"));
	}
}
