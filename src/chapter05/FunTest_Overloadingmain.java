package chapter05;

import java.util.Scanner;

public class FunTest_Overloadingmain { // object
	
	public static void main(String[] args) {
		FunTest_Overloading obj = new FunTest_Overloading();
		
		obj.getResult(20);
		obj.getResult('A');
		obj.getResult("해피 주말 ~~~ ");
		obj.getResult(6,"2023");
		
	}
}
