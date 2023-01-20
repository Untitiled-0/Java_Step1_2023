package chapter07;

public class PersonMain {

	public static void main(String[] args) {
		Person person1 = new Person("너구리",150,50);
	
		System.out.println(person1.name);
		System.out.println(person1.height);
		System.out.println(person1.weight);
		System.out.println("=================");
		System.out.println(person1.name="홍길동");
		System.out.println(person1.height=160F);
		System.out.println(person1.weight=60F);
		
		
	
	}
}
