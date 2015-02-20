/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card( "King", "Spades", 13 );
		Card card2 = new Card( "Seven", "Hearts", 7 );
		Card card3 = new Card( "Jack", "Diamonds", 11 );
		
		System.out.println(card1.rank());
		System.out.println(card1.suit());
		System.out.println(card1.pointValue());
		System.out.println(card1.toString());
	}
}
