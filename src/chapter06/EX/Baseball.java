package chapter06.EX;

import java.util.Random;

public class Baseball {

	public int com1;
	public int com2;
	public int com3;
	public int user1;
	public int user2;
	public int user3;
	
	public void init() {
		do {
			com1 = new Random().nextInt(9) + 1;
			com2 = new Random().nextInt(9) + 1;
			com3 = new Random().nextInt(9) + 1;
		} while (com1 == com2 || com2 == com3 || com1 == com3);
	}
	public void user() {
		
	}
}
