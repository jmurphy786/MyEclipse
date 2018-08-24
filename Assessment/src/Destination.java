import java.util.ArrayList;

public class Destination {
	
	ArrayList<SuperClass> storagechar = new ArrayList<SuperClass>();
	ArrayList<SuperClass> storageitem = new ArrayList<SuperClass>();

	
	
	
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
		
		System.out.println("\nUnfortunately you are too far, Here's a tip -- The item is " + 
		item.getNorth() + " North and " + item.getEast() + " East, "
		+ item.getWest() + " West and " + item.getSouth() + " South. \n\n");		
		
		return false;
	}
	

}
