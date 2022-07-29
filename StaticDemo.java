
//prog to demonstrate use of instance variable local variable static n non static keyword 
//taking an ex of creating sensex report
public class StaticDemo
{
   String name;//instance variable because these are tied upto an obj and cannot be accessed without creating obj
   
   String address;//instance variable
   
   static String city = "Pune";//static variable are part of class not objects & all static variables are class variables
   
   static int i=0; //static or class variable (sharing of variable)
	
   
   StaticDemo(String name, String address)// local variables & defining constructor
	{
	
		this.name = name;//assigning value of local variable to instance variable,this refers to the instance variable
		this.address = address;
		i++;
	System.out.println(i);
	
	}
	
	public void getaddress()
	{
		
		System.out.println(address+" "+city);
	}
	
	
	public static void getcity()//static method, it should have only static variables
	{
		System.out.println(city);//static variable
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StaticDemo sd = new StaticDemo("Jigyasa", "Kharadi");
		StaticDemo sd1 = new StaticDemo("Ramesh", "viman nagar");
	    sd.getaddress();
	    sd1.getaddress();
	    StaticDemo.getcity();//calling the static method, object is not required to call the static method
	    StaticDemo.i=4;//calling static variable
	    sd.address="abc";
	
	}

}
