package problem3;

public class Simple 
{

	public static void main(String[] args) 
	{
	    try
	    {
	    	int x = 50;
		    int y = 0;
		    int result = x / y;  // Exception Occurs because number can't not divided by zore
		    System.out.println(" Result is : " + result );
		    
		    int [] a = new int [7];
		    
		    for ( int b = 0; b<10; b++) // Array Is decleared at maximum index 7 but Loop will run 10 times and this is an Exception 
		    {
		    	a[b] = b+1;
		    	//System.out.println(" Values are : "+ b); // @nd For loop comment korle ai line ta execute hobe
		    }
		    
		    for (int value : a)
		    {
		    	System.out.println(" Values are : "+ value);
		    
		    }
		    //System.out.println(" Value of index 5 is  : " + a[4] );
		    
	     }
		    
		    catch (ArithmeticException e)
		    {
		    	System.out.println(" This Is Arithmatic Exception And Can't Divide by zero " + e);
		        
		    }
	   
	        catch (ArrayIndexOutOfBoundsException e)
		    {
		    	System.out.println(" Array Is decleared at maximum index 7 but Lopp will run 10 times and this is an Exception ");
		    	
		    }
		    catch (Exception e)
		    {
		    	System.out.println(" Exception Class can handle all the unknown Exceptions ");
		    	
		    }
	    
	     
		    
		  
	}

}
