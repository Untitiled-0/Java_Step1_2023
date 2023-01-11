package baekjoon;

import java.util.Scanner;

public class Main {

	public int fibonacci(int n) {
		
		int cnt_zero=0;
		int cnt_one=0;
		
		if (n ==0) {
			cnt_zero++;
			System.out.print("0 ");
			return 0;
		}
		else if(n==1) {
			cnt_one++;
			System.out.println("1 ");
			return 1;
		}
		else {
//			System.out.print(cnt_zero);
//			System.out.print(cnt_one);
			
			return fibonacci(n-1) + fibonacci(n-2);
		}
		
//		return (cnt_zero, cnt_one);
	}

	public static void main(String[] args) {
		Main fi = new Main();
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		fi.fibonacci(n);
		
		
	}
}
