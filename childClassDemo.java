
public class childClassDemo extends parentClassdemo {

	public void engine()
	{
		
		System.out.println("engine code is implemented");
	}
	
	
	public void color()
	{
		
		System.out.println(color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  childClassDemo child = new childClassDemo(); 
	child.color();
	child.brakes();
	child.gear();
	child.engine();
	child.audiosystem();
	
	}

}
