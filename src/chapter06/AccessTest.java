package chapter06;

import javax.swing.JOptionPane;

public class AccessTest {

	private int aa;
	public int bb;
	int cc; // 생략하면 public

	// 디플트 생성자 - 메모리할당, 초기화만 하는 역할
//	public AccessTest() {
//		// TODO Auto-generated constructor stub
//	}

	// 메소드
	public void setAa(int aa) {
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public void Disp() {
		System.out.printf("aa값 : %d\nbb값 : %d \ncc값 : %d \n", aa, bb, cc);
	}

	public static void main(String[] args) {
		
		AccessTest obj = new AccessTest();

		obj.setAa(10);
		obj.setBb(20);
		obj.setCc(30);
		obj.Disp();
	}

}
