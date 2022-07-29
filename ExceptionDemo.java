
public class ExceptionDemo 
{

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub

	
	try {
	int a= 5;
	int b = 0;
	int c= a/b;	
		
		int z[]= new int[5];
		System.out.println(z[6]);
	}
	catch (ArithmeticException est)
	{
	
	System.out.println("I cathced the arithmetic exeption");
	}
	
	catch (IndexOutOfBoundsException es)
	{
	
	System.out.println("I cathced index  exeption");
	}
	
	
	catch (Exception e)
	{
	
	System.out.println("I cathced the exeption");
	}
	
	
	finally
	{
		System.out.println("delete cookies");
		
	}
	
	}

}
