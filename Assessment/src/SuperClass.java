
public class SuperClass {

	private double north = 0;
	private double south = 0;
	private double west = 0;
	private double east = 0;
	

	public void setNorth(double norths) {
		this.north = north + norths;
	}
	public void setEast(double easts) {
		this.east = east + easts;
	}
	public void setWest(double wests) {
		this.west = west + wests;
	}
	public void setSouth(double souths) {
		this.south = south + souths;
	}
	
	public double getTallyNorth() {
		return (this.north - this.south);
	}
	public double getTallyEast() {
		return this.east - this.west;
	}
	public double getNorth() {
		return this.north;
	}
	public double getEast() {
		return this.east;
	}
	public double getWest() {
		return this.west;
	}
	public double getSouth() {
		return this.south;
	}
}
	

