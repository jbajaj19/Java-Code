
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//string is an object that represents sequence of characters
//creating string by literal
		String s = "hello Jigyasa";
	    String s1 = "hello jigyasa"	; //here new object s1 will not be creatd insted a pointer will be created which will point to same objt s
	    
//creating string using new 
	    
	    String s2 = new String("hello jigyasa");//here new objt will be created each time when you write new even if the string is same
	    String s3 = new String("hello jigyasa");
	
	// splitting a string into parts
	    String s4 = "Good afternoon friends";
	    //s4.split(" ");// split is a method of string class to split a string into parts
	    
	    String[] splittedstring = s4.split(" ");//splitting on basis of widespace
	    System.out.println(splittedstring[0]);
	    System.out.println(splittedstring[1]);
	    System.out.println(splittedstring[2]);
	    
	    String[] splittedstring1 = s4.split("afternoon");//splitting on basis of particular word
	     System.out.println(splittedstring1[0]);
	    System.out.println(splittedstring1[1]);
	    System.out.println(splittedstring1[1].trim());
	    
	    // print string in form of characters
	    for(int i =0; i<s4.length();i++)
	    {
	    	System.out.println(s4.charAt(i));//charAt is a method to print char AT particular index
	    }
	    
	   // print string in reverse ordr
	    for(int i =s4.length()-1; i>=0;i--)
	    {
	    	System.out.println(s4.charAt(i));//charAt is a method to print char AT particular index
	    }  
	}

}
