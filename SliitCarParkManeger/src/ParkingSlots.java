
import java.util.ArrayList;

public class ParkingSlots {

	private static final int noSlots =3;

	private ArrayList<Vehicle> arrayParkingSlots;

	public ParkingSlots(){
		this.arrayParkingSlots = new ArrayList<Vehicle>(noSlots);
	}

	public static int getMaxCapacity(){
		return noSlots;
	}

	public int noEmptySlots(){
		return this.noSlots - this.arrayParkingSlots.size();
	}

	public int noOccuipiedSlots(){
		return this.arrayParkingSlots.size();
	}

	public void addVehicle(Vehicle vehicle){

		if(this.noEmptySlots() > 0){
			this.arrayParkingSlots.add(vehicle);
			vehicle.printDetails();
			System.out.println("Succesfully Added!!");
		}
		else {
			System.out.println("SORRY!!..SLIIT Park is full");
		}

	}


	public void parkedVehicles(){
		for(Vehicle vehicle: this.arrayParkingSlots){
			vehicle.printDetails();
		}
		System.out.println("---------------");
	}
}
