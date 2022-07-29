import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendardemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal= Calendar.getInstance();//another way of creating obj
    // calendar and date both are classes and have almost same feature but calendar has some more features
	

		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");		

	System.out.println(sd.format(cal.getTime()));
	System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	
	}

}
