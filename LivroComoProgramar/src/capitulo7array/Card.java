package capitulo7array;

public class Card {

	private String face;
	private String suit;

	public Card(String face, String suit) {

		face = face;
		suit = suit;
	}

	public String toString() {
		return face + "of" + suit;
	}
}
