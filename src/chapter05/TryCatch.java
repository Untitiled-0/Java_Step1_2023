package chapter05;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TryCatch { // object
	
	public static void main(String[] args) {
		int num1, num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
	
	
//		int res=num1/num2;
//		
//		System.out.println(res);
//		
		try {
			System.out.println(num1/num2);
		} catch (Exception e) { //ArithmeticException --> 산술연산
			// TODO: handle exception
			System.out.println("0을 입력하지마세요");
		}
		System.out.println("Error 후 컴파일 => ");
	}
}
