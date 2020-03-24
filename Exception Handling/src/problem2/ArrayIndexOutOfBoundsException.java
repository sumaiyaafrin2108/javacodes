package problem2;

public class ArrayIndexOutOfBoundsException 
{

	public static void main(String[] args) 
	{
		try
		{
			int a[] = new int [5] ;
			System.out.println("Value at index 9 is : " +a[9]); // This is not possible becaue a[9] index er moddhe kono value nei
			
		}
		catch (Exception e)
		{
			
			System.out.println(" This is Array Index Out Of Bounds Exception  ");
			System.out.println (" Continue the Program " );
		}
		

	}

}
