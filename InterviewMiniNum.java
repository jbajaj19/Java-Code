
public class InterviewMiniNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
	int abc[][]	= {{2,4,5}, {3,4,7}, {1,2,9}};
	int min=abc[0][0];// assume that the starting num is the smallest
		
	for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(abc[i][j]<min)
				{
					
					min=abc[i][j];
				System.out.println(min);
				}
					
				
			}
			
		}
		
	}

}
