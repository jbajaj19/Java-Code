import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//current date current time
		
		Date d = new Date();// Date is a class available in util java package, its a general format
		
		//customised format MM/d/YY HH:MM:SS
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");// it is a class for customized forma
		
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");		
		
		System.out.println(d.toString());
				
				System.out.println(sdf.format(d));
				
				System.out.println(sd.format(d));
				

	
	
	}

}
