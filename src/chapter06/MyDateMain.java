package chapter06;

import javax.swing.JOptionPane;

public class MyDateMain {

	public static void main(String[] args) {

		MyDate date = new MyDate();

		date.year = 2023;
		date.moth = 12;
		date.day = 27;
		System.out.printf("%d년 %d월 %d일",date.year,date.moth,date.day);
	}
}
