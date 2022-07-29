import java.util.HashSet;
import java.util.Iterator;

// About set interface
//hashset, treeset, linkedhashset classes which implements set interface
//do not store duplicate values
// there is no guarantee of sequence of storing ie indexing
// parsing in hashset is done just by creating the obj of iterator and calling next methods

public class hashsetDemo
{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub

	  HashSet<String> hs = new HashSet<String>();
	  hs.add("jb");
	  hs.add("jiggi");
	  hs.add("jigyasa");
	  hs.remove("jb");
	  hs.add("jb");// duplicate value will  nt accept
	 Iterator<String> i =  hs.iterator(); // define iterator,used to trace in hashset
	 //System.out.println(i.next());//1st next prints the most top value in hashset 
	// System.out.println(i.next());//2nd next prints the next value and goes on
	  //System.out.println(hs);
	
	  
	  while(i.hasNext())// for printing the values in hashset
	  {
		  System.out.println(i.next());
	  }
	}

}
