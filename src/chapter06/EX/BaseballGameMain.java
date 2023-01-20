package chapter06.EX;

import java.util.Random;
import java.util.Scanner;

public class BaseballGameMain {

	public static void main(String[] args) {
		String check="";
		BaseballGame game = new BaseballGame();
	
		do {
			check=game.check();
		} while (check!="WIN");
	}
}
