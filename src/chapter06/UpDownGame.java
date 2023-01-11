package chapter06;

import java.util.Random;

public class UpDownGame {

	// 28 
	
	private int random = new Random().nextInt(50)+1;
	private int count=0;
	private String result="FAIL";
	
	public String check(int mynumber) {
		count++;
		if(mynumber>random) {
			System.out.println("DOWN");
		}
		else if(mynumber<random) {
			System.out.println("UP");
		}
		else {
			result="SUCCES";
			System.out.println("숫자는 : "+random+"이고 걸린 횟수는 : " + count + " 회 입니다.");
		}
		return result;
	}
}
