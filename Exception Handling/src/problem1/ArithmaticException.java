package problem1;

public class ArithmaticException 
{

	public static void main(String[] args) 
	{
		
		try
		{
			int x = 50;
		    int y = 0;
		    int result = x / y;
		    
		    System.out.println (" Result :  " + result ); // Not possible because 50 k 0 diye divide kora jay na . So this is An Arithmatic Exception
		
		}
		
		catch ( Exception e )
		
		{
			System.out.println (" This is an Arithmatic Exception " );
            
		}
		
		 System.out.println (" Continue the Program " );

		
		
	}

}
