
public class CoreJavaBrushUp1 {

	int i = 5;
	public void getdata()
	{
		System.out.println(i);
		
	}
	public static void main(String[] args) {
		
		int num = 6;
		String website = "Rahul  shetty academy";
		char letter = 'j' ;
		double dec = 8.5;
		boolean mycard = true;
		
		System.out.println(num + " is an even num");
		System.out.println(website);
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(mycard);
		
		//Array
		
		int[] arr = new int[5]; // declaration of array and assigning the memory to array using new operator
		 arr[0]	= 1;
		 arr[1] = 2;
		 arr[2] = 3;
		 arr[3] = 4;
		 arr[4] = 5;
		 
		 //alternate way of declaration and assigning value to array
		 
		 int[] arr2 = {1,2,3,4,5};
		 System.out.println(arr2[0]);
		 
		 //for loop
		 for(int i = 0; i<arr.length; i++)
		 {
			 System.out.println(arr[i]);
		 }
		 
		 // string type array
		 
		String[] name = {"jigyasa","bajaj"};
		// for(int i =0; i<name.length; i++)
		// {
		//System.out.println(name[i]);	 
		// }
	//enhanced for loop
		 for(String s : name)
	System.out.println(s);
	}

}
