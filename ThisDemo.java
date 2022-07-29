

// project on This keyword
public class ThisDemo 

{
 
	int a=5;//global a

	public void getdata()
	{
		
		int a=3;//local a
		int b = a+this.a;
		System.out.println(b);//adds value of local a and global a
		
		System.out.println(a);// it prints output 3
		System.out.println(this.a);// it prints output 2, here this keyword points the current value of a on class level
	}
	public static void main(String[] args)
{
		// TODO Auto-generated method stub

		ThisDemo th = new ThisDemo();
		th.getdata();
	
	}

}
