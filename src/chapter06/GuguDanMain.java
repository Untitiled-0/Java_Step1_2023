package chapter06;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class GuguDanMain {

	public static void main(String[] args) {
		GuguDan gd = new GuguDan();
		
		int num;
		
		System.out.print("출력할 단 : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		gd.showTable(num);
		
	}
}
