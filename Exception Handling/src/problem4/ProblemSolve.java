package problem4;
import java.util.Scanner;

public class ProblemSolve 
{

	public static void main(String[] args)
	{  
		while(true)
		{
			try 
			{
				Scanner item = new Scanner (System.in);
				System.out.print( " Please enter num1 : ");
				int num1 = item.nextInt();
				System.out.print( " Please enter num2 : ");
				int num2 = item.nextInt();
				int result = num1 / num2;
				
				System.out.println ( " Result :" + num1 + "/ " + num2 + " = " + result);
				
			}
			catch (Exception e)
			
			{
				System.out.println ( "Exception: " + e);
				System.out.println ( " You must enter ingteger. Please try again ");
				
			}
			
		}
		
	}

}
