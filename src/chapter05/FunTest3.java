package chapter05;

import javax.swing.JOptionPane;

public class FunTest3 { // object

	public static void Disp(String A[]) {
		String res="";
		
		for(int i=0; i<A.length;i++) {
			res += A[i]+"\n";
		}
		System.out.print(res);
		JOptionPane.showMessageDialog(null, "배열의 원소값\n\n" + res);
	}
	public static void main(String[] args) {
		String str[] = {"JAVA", "Oracle", "JSP", "HTML"};
		
		Disp(str);
		
	}
}
