package lab5;

public class Bicycle {
 public	int gear;
 public	int speed;
 
 
	

	public Bicycle() {
	super();
}

	



	
	public int getGear() {
		return gear;
	}





	
	 
	public void setGear(int gear) {
		this.gear = gear;
	}





	
	public int getSpeed() {
		return speed;
	}





	
	public void setSpeed(int speed) {
		this.speed = speed;
	}





	public Bicycle(int gear, int speed) {
	super();
	this.gear = gear;
	this.speed = speed;
}

	



	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}

	
	
	}


