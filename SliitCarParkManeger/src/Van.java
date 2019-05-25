
public class Van extends Vehicle{

	private int noSeats;

	public Van() {
		super();
	}
	public Van(	String id,String brand,String time, int noSeats) {
		super(id, brand, time);
		this.noSeats=noSeats;	
	}
	public int getNoSeats() {
		return noSeats;
	}

	public void setNoDoors(int noSeats) {
		this.noSeats=noSeats;
	}

	public void printVanDetails(){
		super.printDetails(); 
		System.out.println("Number of Seats " + this.noSeats);
	}
}
