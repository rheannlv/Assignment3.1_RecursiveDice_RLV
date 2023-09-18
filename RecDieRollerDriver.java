
public class RecDieRollerDriver {

	public static void main(String[] args) {
		
		int die = 0;
		int totalTwo = 0;
		int mean = 0;
		
		//Instantiating RecDieRoller and testing roll method.
		RecDieRoller rD = new RecDieRoller();
		//rD.roll(die);
		
		//Testing roll method x1000.
		for (int i = 0; i < 1000; i++) {
			die = rD.roll(die);
			
		//Incrementing the amount of times 2 is rolled.
			if (die == 2) {
				totalTwo++;
			}//end if
		}//end for
		
		//Output of totalTwo.
		System.out.println("The amount of rolls it takes to roll a 2 out of 1000 is " + totalTwo + ".");
		
		//Output of mean.
		mean = 1000 / totalTwo;
		System.out.println(mean + ", the number of die rolls it takes to get a 2.");	
	
	}//end main
	
}//end class
