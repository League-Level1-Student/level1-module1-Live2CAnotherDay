package _06_vault;

import java.util.Random;

public class VaultRunner {
	public static void main(String[] args) {
		Vault cracker = new Vault();
		int guess = new Random().nextInt(1000001);
		cracker.tryCode(int guess);
	}
}
