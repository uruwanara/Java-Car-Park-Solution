
public class Car extends Vehicle{

	private int noDoors;
	private String color;
	
	public Car(){
	super();
	}
	
	public Car(	String id,String brand,String time, int noDoors,String color) {
		super(id, brand, time);
		this.noDoors=noDoors;
		this.color=color;		
	}
	
	public int getNoDoors() {
		return noDoors;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setNoDoors(int noDoors) {
		this.noDoors=noDoors;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	public void printCarDetails(){
		super.printDetails(); 
		System.out.println("Number of Doors " + this.noDoors);
		System.out.println("Color  " + this.color);
		}
	
}
