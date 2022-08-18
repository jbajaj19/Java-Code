package beta;

import org.apache.logging.log4j.*;

public class Demo1 
{
	private static Logger Log = LogManager.getLogger(Demo1.class.getName());

	public static void main(String[] args) 
	
	
	{
		// TODO Auto-generated method stub
   Log.debug("Testing button functionality");
 
	   Log.info("Button is present");
   Log.error("button is not clickable");
   Log.fatal("this is fatal");

   }
   }