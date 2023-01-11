package chapter05;

import java.util.Scanner;

public class FunTest6 { // object

	public FunTest6() {
		// TODO Auto-generated constructor stub
	}
	public static void Edustep(int edu) {

		String step;

		if (edu == 1) {
			step="3단계 입니다.";
		} else if (edu == 2) {
			step="3단계 입니다.";
		} else if (edu == 3) {
			step="3단계 입니다.";
		}
		else {
			step="해당하는 스터디 단계가 없습니다. ";
		}

		System.out.println(step);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String result;
		System.out.print("1~3단계를 선택하세요. : ");
		int input = scan.nextInt();

//		result = Edustep(input);
//		System.out.printf("%s입니다. ",result);
		
		Edustep(input);
	}
}
