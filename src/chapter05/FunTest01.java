package chapter05;

import javax.swing.JOptionPane;

public class FunTest01 { // object

//	public FunTest01() {
//		// TODO Auto-generated constructor stub
//	}
	// 접근한정자 : public (공용)
	// 합계 메소드 (함수) // void는 반환은 안한다.
	// protected (패키지 내부에서만 사용) : 상속에서 사용 / private(클래스 내에서만 사용) :
	// static 은 자주쓰는 것과, 중요한것, 그리고 무거운것은 올리지 않는게 좋다.
	
	public void sum(int num1, int num2) {
		int result = num1+num2;
		System.out.println(result);
	}
	public static int sum1(int num1, int num2) {
		int result = num1+num2;
		return result;
	}
	
	
	public static void main(String[] args) {
		
		int a,b,total;
		a = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("값2"));
		total = sum1(a,b);
		
		FunTest01 Obj=new FunTest01();
		Obj.sum(a,b); // stack에 있는 걸 heap에 불러서 가져온다.
		
		System.out.println(total);
	}
}
