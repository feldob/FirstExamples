package fk.examples.onlinecasino;

import java.util.Random;

public class WheelOfFortune {

	private static final Random RNG = new Random();

	public void spin(Player player, int amount) {
		int currentCredit = player.getCredit();
		if (currentCredit < amount) {
			System.out.println("Du har inte tillräckligt med saldo för att spela.");
			return;
		} else if (RNG.nextInt(4) == 3) {
			player.setCredit(currentCredit + amount);
			System.out.println("Du vann " + amount + " kronor. Grattis!");
		} else {
			player.setCredit(currentCredit - amount);
			System.out.println("Tyvärr, du förlorade.");
		}
	}
}
