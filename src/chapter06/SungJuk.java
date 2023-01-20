package chapter06;

import javax.swing.JOptionPane;

public class SungJuk {

	private String std_num;
	private String std_name;
	private int java, oracle, spring;

	// 디폴트 생성자(생략)
	// 평소에는 생략, 꼭 필요할때 꺼내야할 때가 있다.

	// 메서드
	public void Sum() {
		int total = java + oracle + spring;

		System.out.println("총 합계 : " + total);
	}

	public void Avg() {
		int avg = (java + oracle + spring) / 3;

		System.out.println("평균 : " + avg);
	}

	public static void main(String[] args) {
		
		SungJuk res = new SungJuk();
		
		res.std_num=JOptionPane.showInputDialog("학번");
		res.std_name=JOptionPane.showInputDialog("이름");
		
		res.java=Integer.parseInt(JOptionPane.showInputDialog("자바점수 입력 :"));
		res.oracle=Integer.parseInt(JOptionPane.showInputDialog("오라클점수 입력 :"));
		res.spring=Integer.parseInt(JOptionPane.showInputDialog("스프링점수 입력 :"));

		System.out.printf("학번 %s 성명 %s의 성적입니다.\n",res.std_num,res.std_name);
		System.out.printf("=========================\n");
		res.Sum();
		res.Avg();
		
	}
}
