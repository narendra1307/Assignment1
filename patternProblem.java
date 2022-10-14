package Assignment1_8thOct2022;

public class patternProblem {

	public static void main(String[] args) {
		
		int i,j, n=6;
		for(i=0 ;i<n;i++)
		{
			for(j=2*(n-i); j>=0 ;j--)
			{
				System.out.println(" ");
			}
			for(j=0; j<=i; j++) 
            {       
                System.out.print("*"); 
            }           
            System.out.println(); 
        }
	}
	

}
