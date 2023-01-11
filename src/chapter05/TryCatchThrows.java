package chapter05;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TryCatchThrows { // object

	public static void fun() throws Exception {
		try {
			System.out.println("fun()메서드");
			throw new Exception();
		} catch (RuntimeException e) { // RuntimeException 실행중에 발생하는 에러
			// 에러시 수행하는 수행문 
			System.out.println("예외발생");
		} finally {
			System.out.println("finally문장");
		}
	} // 메소드
	
	
	public static void main(String[] args) {
		
		// static이므로 바로 호출 가능해야하지만 throws Exception 메소드 이므로 try catch안에서만 돌려아함.
//		fun(); ->throws 안전장치인 try catch안에서 써야한다.
		// interface, 상속 
		try {
			fun();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("main()의 catch문장");
		
		}
	}
}
