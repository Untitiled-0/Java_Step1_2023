package chapter05;

public class FunTest02 { // object

	public static void swap(int x, int y) {
		int tmp=x;
		x=y;
		y=tmp;
	}
	public static void main(String[] args) {
		
		int a=10, b=20;
		System.out.printf("교체 전 (x,y) = (%d,%d)\n",a,b);

		FunTest02 Obj = new FunTest02();
		swap(a,b);
		
		System.out.printf("교체 후 (x,y) = (%d,%d)",a,b);
	}
}
