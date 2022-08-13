import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Globalvaluesdrive {

	public static void main(String[] args) throws IOException
	
	{
		// TODO Auto-generated method stub
     
		Properties prop = new Properties();//proprties is a class to access the file with .properties 
		//tp load method in reading mode
		FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\.eclipse\\introduction\\src\\data.properties");//path of file
		
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
	 prop.setProperty("browser", "Firefox");//to chngthe value at run tym
	 System.out.println(prop.getProperty("browser"));
	 //to write back to file
	 FileOutputStream fos = new FileOutputStream("C:\\Users\\LENOVO\\.eclipse\\introduction\\src\\data.properties");
	prop.store(fos, null);
	}

}
