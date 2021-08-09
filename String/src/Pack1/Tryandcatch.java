package Pack1;

public class Tryandcatch {

	public static void main(String[] args)
	{
		System.out.println("start");
		int a= 10;
		int b=0;
		int[] c = {1,2,3};
		try
		{
			int d= a / b;
		System.out.println(d);
		System.out.println(c[9]);
		
		}			
	    catch(ArithmeticException e)
			{
	    	
	    	System.out.println("b=0");
			}
		catch( ArrayIndexOutOfBoundsException r)
		{
			System.out.println(c[2]);
		}
		finally 
		{
			try
			{
				
			int h=8;
			int f= 0;
			int j = h/f;
			System.out.println(j);
		}
			catch(ArithmeticException v)
			{
				System.out.println("not valid");
			}
		}
	}}
	
	
	
	
	
	
	
	
	
	
	
	

