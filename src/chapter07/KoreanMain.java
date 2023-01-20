package chapter07;

public class KoreanMain {

	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "111");
		System.out.println("name :" +k1.name);
		Korean k2 = new Korean("김자바", "111");
		System.out.println("name :" +k2.name);
		System.out.println("name :" +k2.nation);
	}
}
