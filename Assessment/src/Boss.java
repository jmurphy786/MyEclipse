import java.util.Random;
import java.util.Scanner;

public class Boss {
	private double guessN;
	private double guessS;
	private double guessE;
	private double guessW;
	
	public void bossFight1() {
		System.out.println("\n\nOH NO, YOU UPSET THE SWAMP BROTHERS!!!!  \n\n");
		System.out.println("                                             ");
		System.out.println("          |||||||||||||||||||||||||||||              |||||||||||||||||||||||||||||      ");
		System.out.println("          -----------------------------              -----------------------------      ");
		System.out.println("         | (   |*|    )  (    |*|   )  |             | (   |*|    )  (    |*|   ) |  ");
		System.out.println("          |          ( , ,)            |              |          ( , ,)          | ");
		System.out.println("           |                          |                |                        |               ");
		System.out.println("           |          ===            |                  |          ===         |       ");
		System.out.println("             ----------------------                     ----------------------     ");
		System.out.println("                     |   |                                     |    |  ");
		
	}
	
	public Boolean dodgetheattack(int decision) {
		if (decision == 1) {
			System.out.println("Congratulations you dodge the attack and get out with your items unscathed!");
			return true;
		}
		else if (decision == 0) {
			System.out.println("The power of the swamp brothers overcome you, you have perished in the World with no end");
			endScene();
			return false;
		}
		return false;
	}
	
	public void bossMan() {
		System.out.println("\n\nOr so you have thought, stalking the swamp brothers was an even greater being and now it is staring at you!!  \n\n");
		System.out.println("    |-|                    |-|");	
		System.out.println("   |---|                  |---|");
		System.out.println(" |-------|              |-------|");
		System.out.println(" |-------|              |-------|");
		System.out.println(" |------------------------------|");
		System.out.println(" |------------------------------|");
		System.out.println(" |---- -(  . )----------(  . )--|");
		System.out.println(" |------------------------------|");
		System.out.println(" |------------------------------|");
		System.out.println(" |------------------------------|");
		System.out.println(" |-------------[    ]-----------|");
		System.out.println(" |------------------------------|");
		System.out.println("  |----------==========--------|");
		System.out.println("   |--------------------------|");
		System.out.println("    |----------------------|");
		System.out.println("             |     |");
		System.out.println("You see a glistening item on muddy area around you, but you are disorientated you cannot find your bearings" + 
		"the item is in an area 1m^2 around your body, it might be your only chance to get out alive! Where do you move?");
	}
	
	public Boolean guessitem(double north, double south, double west, double east) {
		if(guessdir() == true) {
			System.out.println("You pick up what appears to be a magic item of sorts and the boss begins " +
					"to run away in fear. You have survived yet again.");
			winScene();
			return true;
		}else
			endScene();
		return false;
	}
	
	public Boolean guessdir() {
		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Please Enter North - Please enter 0 to not move");
		guessN = s.nextDouble();
		double compareN = rand.nextInt(2);
		System.out.println("Please Enter South - Please enter 0 to not move");
		guessN = s.nextDouble();
		double compareS = rand.nextInt(2);
		System.out.println("Please Enter East - Please enter 0 to not move");
		guessN = s.nextDouble();
		double compareE = rand.nextInt(2);
		System.out.println("Please Enter West - Please enter 0 to not move");
		guessN = s.nextDouble();
		double compareW= rand.nextInt(2);
		
		if(guessN == compareN && guessS == compareS && guessE == compareE && guessW == compareW) {
			return true;
		}
		return false;
	}
	
	public void endScene() {
		System.out.println("\n\n====================================================");
		System.out.println("====================================================");
		System.out.println("==================== Y O U ========================");
		System.out.println("=================== L O S E ========================");
		System.out.println("====================================================");
		System.out.println("====================================================");
	}
	
	public void winScene() {
		System.out.println("\n\n====================================================");
		System.out.println("====================================================");
		System.out.println("==================== Y O U ========================");
		System.out.println("===================  W I N ========================");
		System.out.println("====================================================");
		System.out.println("====================================================");
	}
	
	public void boss2() {
		System.out.println("\n\n *Something Appears in the dark* \n\n");
		System.out.println(" |------------------------------|");
		System.out.println(" |                              |");
		System.out.println(" |   (   (.)   )    (  (.)  )   |");
		System.out.println(" |                              |");
		System.out.println(" |               --             |");
		System.out.println(" |()()()()()()()()()()()()()()()|");
		System.out.println(" |()()()()()()()()()()()()()()()|");
		System.out.println(" |()()()()()()()()()()()()()()()||");

	}
}