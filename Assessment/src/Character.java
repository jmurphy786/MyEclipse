import java.util.Scanner;

public class Character extends SuperClass {
	private String name;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setChar() {
		System.out.println("Please Enter North - Please enter 0 to not move");
		Scanner s = new Scanner(System.in);
		Double north = s.nextDouble();
		this.setNorth(north);
		System.out.println("Please Enter West - Please enter 0 to not move");
		Double west = s.nextDouble();
		this.setWest(west);
		System.out.println("Please Enter East - Please enter 0 to not move");
		Double east = s.nextDouble();
		this.setEast(east);
		System.out.println("Please Enter South - Please enter 0 to not move");
		Double south = s.nextDouble();
		this.setSouth(south);	
	}
}
