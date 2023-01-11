package chapter05;

import java.util.Scanner;

public class FunTest4 { // object

	public String channel; // 멤버변수
	public int channelInt; // 멤버변수
	public int volume; // 멤버변수
	
	public void channelUp(int volume) {
		System.out.println("소리를 " + volume + "만큼 올립니다. ");
	}
	public void channelDown(int volume) {
		System.out.println("소리를 " + volume + "만큼 내립니다. ");
	}
	public void channelChange(String channel) { //오버로딩하는 이유 다형성 만족하기 위해서 
		System.out.println("TV 채널을 " + channel + "로 바꿉니다. ");
	}
	public void channelChange(int channelInt) {
		System.out.println("채널을 " + channelInt + "로 바꿉니다. ");
	}
	
	
	
	public static void main(String[] args) {
		
		FunTest4 tv = new FunTest4();

		int v, cI;
		String cS;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("어느 정도 볼륨을 조절할 것인가요? : ");
		v = scan.nextInt();
		System.out.print("채널을 조절할 것인가요(Int)? : ");
		cI = scan.nextInt();
		System.out.print("TV채널을 조절할 것인가요(String)? : ");
		cS = scan.next();
		
		
		tv.channelUp(v);
		tv.channelDown(v);
		tv.channelChange(cI);
		tv.channelChange(cS);

	}
	
}
