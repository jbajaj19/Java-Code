
public class Nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 for(int i=1; i<=4; i++) // (outer loop) this loop runs for 4 times
		 {
			 System.out.println("Outer loop started");
			 
			 for(int j=1; j<=4; j++)// (inner loop)
			 {
				 System.out.println("inner loop");
			 }
			 System.out.println("Outer loop Ended");
			 
		 }
	}

}

