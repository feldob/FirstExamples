package fk.examples.onlinecasino;

public class OnlineCasinoUseCase {

	public static void main(String[] args) {
		Player alice = new Player("Alice", 1000);
		WheelOfFortune wheeloffortune = new WheelOfFortune();

		while (alice.getCredit() >= 100) {
			wheeloffortune.spin(alice, 100);
		}
	}
}
