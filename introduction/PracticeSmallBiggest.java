package introduction;

public class PracticeSmallBiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//prog to find smallest number in row and then find largest number in the colunm of smallest num	
		
		int abc[][]	= {{2,4,5}, {3,4,7}, {1,2,9}};
		int min=abc[0][0];// assume that the starting num is the biggest
		int mincoloumn = 0;	
		for(int i=0; i<3; i++)
			{
				for(int j=0; j<3; j++)
				{
					if(abc[i][j]<min)
					{
						
						min=abc[i][j];
						mincoloumn = j;
						
						
					}
						
					
				}

	}//output received will be 1
		
int max = abc[0][mincoloumn];
int k = 0;	
	while(k<3)
	{
		
		if(abc[k][mincoloumn]>max)
		{
			max = (abc[k][mincoloumn]);
		}
	k++;	
	}
	System.out.println(max);
	}
	
	}
