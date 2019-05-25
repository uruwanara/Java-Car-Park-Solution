import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

public class SliitCarParkManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;while(a==0) {
			System.out.println("+-------------------------------------------------------+");
			System.out.println("|		Sliit CarPark Manager			|");
			System.out.println("+-------------------------------------------------------+");
			System.out.println("Select the option: ");
			System.out.println(" 	a. Add a Vehicle ");
			System.out.println("	b. Delete a Vehicle");
			System.out.println("	c. View the details of parked Vehicles");
			System.out.println("	d. Number of Empty Slots");
			System.out.println("	e. Number of Occupied Slots");
			System.out.println("	f. Exit ");

			Scanner sc=new Scanner(System.in);
			char op=sc.next().charAt(0);

			switch (op) {
			case 'a':AddVehicle(); break;
			case 'b':DelVehicle(); break;
			case 'c':getDetails(); break;
			case 'd': System.out.println("Number of Empty slots are : "+NoEslots());  break;
			case 'e': System.out.println("Number of Occupied slots are : "+NoOslots());  break;
			case 'f':System.out.println("Thank You for using the System ");  break;
			default : System.out.println("Wrong Input. Try Again ");  break;

			}
		}

	}

	static void AddVehicle(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();
		Scanner sc=new Scanner(System.in);

		System.out.println("Please Enter the Vehicle Type");
		System.out.println("	c. Car");
		System.out.println("	v. Van");
		System.out.println("	t. Threewheel ");
		char type=sc.next().charAt(0);

		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the Brand");
		String brand=sc1.nextLine();

		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter the Number Plate Number");
		String id=sc2.nextLine();

		ParkingSlots addVeh=new ParkingSlots();

		switch (type) {
		case 'c': {
			Scanner sc3=new Scanner(System.in);
			System.out.println("Enter number of Doors");
			int noDoors=sc3.nextInt();

			Scanner sc4=new Scanner(System.in);
			System.out.println("Enter the color");
			String color=sc4.nextLine();		

			Car tempCar = new Car(id,brand,dtf.format(now),noDoors,color);
			addVeh.addVehicle(tempCar);	
			break;
		}

		case 'v': {
			Scanner sc5=new Scanner(System.in);
			System.out.println("Enter number of Seats");
			int noSeats=sc5.nextInt();

			Van tempVan = new Van(id,brand,dtf.format(now),noSeats);
			addVeh.addVehicle(tempVan);	
			break;
		}

		case 't': {
			Scanner sc4=new Scanner(System.in);
			System.out.println("Is it a taxi? Y/N ");
			char tx=sc4.next().charAt(0);;		
			if(tx=='Y') {
				ThreeWheel tempWheel = new ThreeWheel(id,brand,dtf.format(now),true);

				addVeh.addVehicle(tempWheel);

			}
			else if(tx=='N') {
				if(tx=='Y') {
					ThreeWheel tempWheel = new ThreeWheel(id,brand,dtf.format(now),false);

					addVeh.addVehicle(tempWheel);	
				}
				break;
			}
		}
		}


	}

	static void DelVehicle() {

	}
	static void getDetails() {
		System.out.println("Details of All the vehicles at the present: ");
		ParkingSlots tabc=new ParkingSlots();
		tabc.parkedVehicles();

	}
	static int NoEslots() {
		ParkingSlots tmp=new ParkingSlots();
		return tmp.noEmptySlots(); 

	}
	static int NoOslots() {
		ParkingSlots tmp=new ParkingSlots();
		return tmp.noOccuipiedSlots();
	}


}
