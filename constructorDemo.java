
public class constructorDemo {
	
	
	
	public constructorDemo()// default constructor type, no return type 
	{
	System.out.println("I am a constructor");
	}
	

	public constructorDemo(int a,int b)// parameterised constructor type, no return type 
	{
	System.out.println("I am a parameterised constructor");
	int c = a+b;
	System.out.println(c);
	}
	

	public constructorDemo(String str)// default constructor type, no return type 
	{
	System.out.println("I am a string");
	}
	
	
	public void constructorDemo()// method, has a return type 
	{
	System.out.println("I am a method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		constructorDemo cd = new constructorDemo();
		//cd.constructorDemo();
	
		constructorDemo cd1 = new constructorDemo(4,5);
		constructorDemo cd2 = new constructorDemo("hello world");
	}

}
