package chapter07;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		int side;
		int height;
		int Area;
		
		Encapsulation obj = new Encapsulation();
				
		side = Integer.parseInt(JOptionPane.showInputDialog("side : "));
		height = Integer.parseInt(JOptionPane.showInputDialog("hight : "));
		String str="area : "+ obj.Cal_Area(side, height)+"입니다.";
		
		JOptionPane.showMessageDialog(null, str);
		System.out.println("area : " + obj.Cal_Area(side, height));
		
	}
}
