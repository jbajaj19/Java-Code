import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Test1 a = new Test1();
		a.regular();
		a.streamfilter();
		a.Map();
		a.streamCollect();
	}
	@Test
	public void regular()
	{
//count the num of names strting wid j alphabet in list
	
	/*	ArrayList <String> names = new ArrayList<String> ();
	names.add("jigyasa");
	names.add("Nayan");
	names.add("john");
	names.add("james");
	names.add("Reshma");
int count = 0;	
	for(int i =0;i<names.size();i++)
	{
		
		String actual = names.get(i);
		if(actual.startsWith("j"))
		{
			count++;
			
		}
	}

	System.out.println(count);*/
	}
	
//same prog using stream
	@Test
	public void streamfilter()
	{
	/*ArrayList <String> names = new ArrayList<String> ();
	names.add("jigyasa");
	names.add("Nayan");
	names.add("john");
	names.add("james");
	names.add("Reshma");
	
	//there is no life of intremediate opertn if there is no terminal operatn
	//terminl opertn count will execute only if the intrmediate oprtn filter is true
	//we can create stream using package
	//hoe to use filter in stream API
	long c= names.stream().filter(s->s.startsWith("j")).count();//stream defining
	
	System.out.println(c);
	
	//Stream.of("jigyasa","nayan","john","james","Reshma").filter(s->s.startsWith("j")).count();
	
	names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	*/
	}
 @Test
public void Map()
{
	
	/*//print names having last lettr as "a" with Uppercase
	Stream.of("jigyasa","nayan","john","james","Reshma").filter(s->s.endsWith("a"))
	.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	//print names strting with "j" and are sorted
	
	List<String> names = Arrays.asList("jigyasa","nayan","john","james","Reshma");//converting array to array list
	names.stream().filter(s->s.startsWith("j")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));*/
	 List<String> names = Arrays.asList("jigyasa","nayan","john","james","reshma");
	List<String> names1 = Arrays.asList("bob","cathrine","yogesh","suresh");
	
	//merging 2 diferent   lists
	Stream<String> newstream = Stream.concat(names.stream(), names1.stream());
	//newstream.sorted().forEach(s->System.out.println(s));	
	boolean flag = newstream.anyMatch(s->s.equalsIgnoreCase("john"));
	
	Assert.assertTrue(flag);
System.out.println(flag);
}

@Test
public void streamCollect()

{

	List<String> ls = Stream.of("jigyasa","nayan","john","james","Reshma").filter(s->s.endsWith("a"))
	.map(s->s.toUpperCase()).collect(Collectors.toList());
	ls.get(0);
	System.out.println(ls.get(0));
	
	
	//assingment get unique numbers and sort the array (3,2,2,9,7,1,5,7)
	
	List<Integer> values = Arrays.asList(3,2,2,9,7,1,5,7);
	
	values.stream().distinct().sorted().forEach(n->System.out.println(n));
}

}
