import java.util.Random;
/**
 * 
 * @author RLV
 * Die program that rolls until it 
 * rolls a 2
 * 
 */
public class RecDieRoller {	
	/** 
	 * Rolls a die randomly until it rolls a 2
	 * @param n integer of rolls
	 * @return face the integer representing the face of the die
	 */
	public int roll(int n) {
		int face =0;
		Random gen = new Random();
		face = gen.nextInt(6)+1;
		
		if (face == 2) {
			System.out.println("It's a 2!");
		} else {
			roll(n);
			System.out.println("A " + face + " was rolled.");
		}
		
	return face;
	
	}//end roll
	
}//end class
