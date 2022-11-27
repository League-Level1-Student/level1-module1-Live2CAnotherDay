package _06_vault;

import java.util.Random;

import javax.swing.JOptionPane;

public class VaultRunner {
	public static void main(String[] args) {
		Vault cracker = new Vault();
		int guess = new Random().nextInt(1000001);
		while (cracker.tryCode(guess) == false) {
		
			JOptionPane.showMessageDialog(null, "The Vault has been unlocked, Congratz ");
			
		
			cracker.tryCode(guess);
		}
	}
}
/// Nothing else to work on here