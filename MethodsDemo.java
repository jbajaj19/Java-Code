
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 MethodsDemo d = new MethodsDemo();
 d.getdata();
	String name = d.getdata();
	System.out.println(name);
	MethodsDemo2 d1 = new MethodsDemo2();
	d1.getUserdata();
	getdata1();
	}
// public void getdata()
//{
//System.out.println("hello world");
//}
 
 public String getdata()
 {
	 System.out.println("hello world");
	 return "Jigysa";
 }
 
 public static void getdata1()//static keyword is used to access the class methods without creating its object
 {
	 System.out.println("hello world"); 
 }
}