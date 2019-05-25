
public class ThreeWheel extends Vehicle {

	private Boolean isTaxi;

	public ThreeWheel() {
		super();
	}
	public ThreeWheel(	String id,String brand,String time, boolean isTaxi) {
		super(id, brand, time);
		this.isTaxi=isTaxi;	
	}
	public boolean getIsTaxi() {
		return isTaxi;
	}

	public void setNoDoors(boolean isTaxi) {
		this.isTaxi=isTaxi;
	}

	public void printThreeWheelDetails(){
		super.printDetails(); 
		System.out.println("Is it a Taxi " + this.isTaxi);
	}
}
