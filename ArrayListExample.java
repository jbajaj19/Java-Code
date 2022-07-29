//about llist interface
//arraylist is a class which is collection of methods using which it is easy 
//to perform operations on array, is provide flexibility to add, remove any item from the array 
//from any index position

// arraylist is a class which implements list interface
// arraylist, linkedlist, vector are 3 classes which implements list
//can contain duplicate value
//array size is fixed but arraylist size is dynamic

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) 
	
	
	{
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();//syntax of Arraylist
		a.add("jigyasa");//adding an element to array
		a.add("and");
		a.add("shubham");
		a.add(0, "love");
		//a.remove(0);
		
	System.out.println(a.contains("0"));
	//System.out.println(a.indexOf("shubham"));
	//System.out.println(a.isEmpty());
	//System.out.println(a.size());
	}

}
