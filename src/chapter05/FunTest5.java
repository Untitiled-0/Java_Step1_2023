package chapter05;

public class FunTest5 { // object

	public String channel; // heap 클래스 -> heap
	public int channeInt;
	public int volume;
	
	// void외에 모든 타입의 메소드는 반소드 return을 받는다.
	
	public int channelUp(int volume) { // stack 메소드는 stack
		this.volume=volume; // 나 자신의 클래스 -> volume으로 올려준다. 
		return volume +2;
	}
	public static void main(String[] args) {
		
		
		
	}
	
}
