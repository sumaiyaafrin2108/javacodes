package lab5;
 
public class Car extends Vehicle {
	int noofseat;

	public Car() {
		super();
	}

	public Car(int noofseat) {
		super();
		
		this.noofseat = noofseat;
		
	}
	
	public void setNoOfSeats(int seats) 
	{
		noofseat = seats;
	}

	@Override
	public String toString() {
		return "Car [noofseat=" + noofseat + ", licenseplate=" + licenseplate + "]";
	}
}
