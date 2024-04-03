package fk.examples.onlinecasino;

import java.util.Random;

public class Roulette {
	
	private static final Random RNG = new Random();

	public void bet(Player player, int amount, boolean colorboolean) {
		String color = colorboolean ? "Red" : "Black";
		
		System.out.println("You play " + color);
		
		int currentcredit = player.getCredit();
		if (RNG.nextBoolean() == colorboolean) {
			System.out.println("The chosen color is " + color + ", you won!");
			player.setCredit(currentcredit + amount);
		} else {
			System.out.println("Oh no, not your color - you lost!");
			player.setCredit(currentcredit - amount);
		}
	}
}