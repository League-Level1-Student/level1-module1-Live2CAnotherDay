package _03_cat;

import javax.swing.JOptionPane;

public class CatRunner {
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Hello, What would You like to Name this Cat: ");
		Cat kit = new Cat(name);
		kit.meow();
		kit.printName();
		while (true){
			for (int i = 0; i < 9;i++ ){
				
				kit.kill();
			}
			System.out.print("Good job! You angered PETA!");
			System.exit(0);
			
			
				
			
		}
		
	}

}
/// Nothing Else to work in here