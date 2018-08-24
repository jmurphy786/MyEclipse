
public class level2 extends SuperClass{
	public void notyet() {
		
		System.out.println("You should know better than that, this is a world with no end, there are no winners!!");
		System.out.println("Congruatluations on getting to the harder level where the items are bosses are harder.");
		
	}
	
	public Boolean Arewethere(Character character, Item item) {
		
		System.out.println("\nYour charcter is currently "+ 
		character.getNorth() + " North and " + character.getEast() + " East, "
		+ character.getWest() + " West and " + character.getSouth() + " South. \n");
		
		if ((character.getTallyNorth() == item.getTallyNorth()) && 
			(character.getTallyEast() == item.getTallyEast())) {
			System.out.println("Congratulations " + character.getName() + " You Made it!! " + 
		    "Here is your " + item.getName() + ".");
			return true;
		}
		
		System.out.println("\nUnfortunately you are too far, Here's a tip but we wont give you everything!! -- The item is " + 
		item.getNorth() + " North " + item.getWest() + " West\n\n");		
		
		return false;
	}
	public Boolean guesspass(String password) {
		if(password == "password123") {
			System.out.println("The mysterious being is surprised, no one had ever been able guess that before");
			return true;
		}
		else
			System.out.println("You have guessed wrong and for that you have been punished");
			return false;
	}
}
