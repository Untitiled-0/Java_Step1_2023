package chapter05;

import java.util.Scanner;

public class FunTest_Overloading { // object
	
	public void getResult(int n) {
		System.out.println(n+"은(는) int 입니다.");
	}
	public void getResult(char n) {
		System.out.println(n+"은(는) char 입니다.");

	}
	public void getResult(String st) {
		System.out.println(st+"은(는) String 입니다.");

	}
	public void getResult(int n,String st) {
		System.out.println(n+"은(는) int와 "+st+" String 입니다.");

	}
	public static int recu(int n) {
		if(n==1){
			System.out.print(n + "까지 수를 곱한 값 : ");
			return 1;
		}
		else {
			System.out.print(n+ " ");
			return recu(n-1) * n;
		}
	}
	public static void main(String[] args) {
		int n,result;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		System.out.println("메소드 호출 ");
		result = recu(n);
		System.out.println(result);
	}
}
