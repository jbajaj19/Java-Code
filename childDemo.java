

// project of super keyword usage for same method names n constructor name n variable name
//super keyword is used to avoid redundancy when there are same string name in parent and child class
 

public class childDemo extends ParentDemo

{
  String s = "String in child class";

  public childDemo()
  {
	
	  super();//calling the constructor, it should always be in first line 
	  System.out.println("I am a constructor in child");    
  
  }
  
  
  public void getdata()
	{
		super.getdata();//runs the method of parent class
		System.out.println("method of child class");
	}
  
  
  public void getstring()
	{
		
	  System.out.println(s);// prints string in childclass
	  System.out.println(super.s);//prints string in parent class
	
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   childDemo cd = new childDemo();
   cd.getstring();
	cd.getdata();
	
	
	
	}

}
