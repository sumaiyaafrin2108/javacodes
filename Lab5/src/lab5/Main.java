package lab5;

public class Main {
	
	public static void main(String []args) 
	{
		
		//Bicycle
		
		Bicycle b1 = new Bicycle();
		b1.setGear(50);
		b1.setSpeed(35);
		System.out.println(b1);
		
		Bicycle b2 = new Bicycle(3,9);
		System.out.println(b2);
	
		MountainBike mb1 = new MountainBike();	
		System.out.println(mb1);
		
		//Employee objects
		Employee e1 = new Employee();
		e1.setId(100);
		e1.setSalary(50000);
		e1.setName("RR");
		
		
		e1.show();
		
		Employee e2 = new Employee(12,"LL",100000);
		e2.show();
		
		
		//Vehicle objects
		
		Vehicle v=new Vehicle("DHK-1005k");
		
		System.out.println(v);
		
		Vehicle v1=new Vehicle();
		v1.setLicenseplate("CTg-178k");
		System.out.println(v1);
		
		
		Car c=new Car();
		c.setNoOfSeats(10);
		
		
		c.setLicenseplate("CTG-1305");
	 
		System.out.println(c);
		
	}

}
