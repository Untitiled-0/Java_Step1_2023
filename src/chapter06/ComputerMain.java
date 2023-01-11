package chapter06;

public class ComputerMain {

	public static void main(String[] args) {
		
		Computer com = new Computer();
		
		int[] i = {1,2,3,4,5};
		
//		com.sum1(i);
//		com.sum2(i);
		
		System.out.println(com.sum1(i));
		
		int result2=com.sum2(new int[] {1,2,3,4,5});
		System.out.println(result2);
	}
}
