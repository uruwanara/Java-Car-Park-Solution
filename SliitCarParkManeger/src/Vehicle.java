
public class Vehicle {
	String id;
	String brand;
	String time;
	
	public Vehicle() {}
	
	public Vehicle(String id,String brand,String time) {
	 this.id = id;
	 this.brand = brand;
	 this.time=time;
	}
	
	public String getId(){
		 return id;
	}
	public String getBrand(){
		 return brand;
	}
	public String getTime(){
		 return time;
	}
	
	public void setId(String id){
		 this.id = id;
	}
	public void setBrand(String brand){
		 this.brand = brand;
	}
	public void setTime(String time){
		 this.time=time;
	}
	public void printDetails(){
		System.out.println("id=  " + this.id);
		System.out.println("brand=  " + this.brand);
		System.out.println("time=  " + this.time);
	}
}