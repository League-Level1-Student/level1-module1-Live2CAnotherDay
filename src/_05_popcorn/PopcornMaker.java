package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		Popcorn food = new Popcorn(null);
		food.eat();
		
		String time = JOptionPane.showInputDialog("Please Input the Time to cook the Popcorn:  ");
		int minutes = Integer.parseInt(time);
		Microwave micro = new Microwave();
		micro.setTime(minutes);
		micro.putInMicrowave(food);
	food.applyHeat();
		
	}
}
/// Nothing Else to work on here
