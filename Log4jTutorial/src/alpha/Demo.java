package alpha;

import org.apache.logging.log4j.*;

public class Demo 
{
	private static Logger Log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) 
	
	
	{
		// TODO Auto-generated method stub
   Log.debug("I am debugging");
 
	   Log.info("object is present");
   Log.error("object is not present");
   Log.fatal("this is fatal");

   }
   }