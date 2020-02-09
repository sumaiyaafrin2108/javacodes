public class HelloWorld {
	public static void main(String []args) {
			
			//Problem 1
			int height = 10;
			int width = 20;
			int area = height * width;
			int perimeter = 2*(height*width);
			System.out.println( "The area of the rectangle is " + area);
			System.out.println( "The perimeter of the rectangle is " + perimeter);
		
		//Problem 2
		int amount = 50;
		double vat = 15 * 100 / amount; 
		System.out.println(vat);
		
		//Problem 3
		
		int givenNumber = 8;
		
		if(givenNumber % 2 == 0) 
		{
			System.out.println("Even Number");
		}
		else 
		{
			System.out.println("Odd Number");
		}
		
		
		//Problem 4
		
		int numberOne = 10;
		int numberTwo = 20;
		int numberThree = 30;
		
		
		if(numberOne > numberTwo && numberOne > numberThree) 
		{
			System.out.println("Number One is greater");
		}else if(numberTwo > numberOne && numberTwo > numberThree) 
		{
			System.out.println("Number Two is greater");
		}else 
		{
			System.out.println("Number Three is greater");
		}
		
		
		//Problem 5
	
		for(int i=10; i<100; i++) 
		{
			if(i % 2 == 0) 
			{
				
			}
			else 
			{
				System.out.println("Number is Odd " + i);
			}
		}
		
		//Problem 6
		
		int[] myArray = {10, 20, 30,40, 30};
	
		
		for(int i=0; i< 5; i++) 
		{
			if(myArray[i] == 30) 
			{
				System.out.println("Found Value 30");
			}
		}
		
		
		//Problem 7,1
		
		for(int i=0; i<4; i++) 
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
//Problem 7,2
		
		for(int i=3; i > 0; i--) 
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
		
//Problem 7,3
		int alphabet = 65; //A
		
		for(int i=0; i<4; i++) 
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print((char) alphabet);
				alphabet = alphabet+1;
			}
			System.out.print("\n");
		}
			
	   }
}
