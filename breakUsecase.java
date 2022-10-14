package Assignment1_8thOct2022;

public class breakUsecase {

	public static void main(String[] args) {
		
		//Write a program which will break the current execution if it find number 85
		//Input – [12,34,66,85,900]
		
		int[] number = {12,34,66,85,900};
		int i=0;
		while(i<=number.length-1)
		{
			if(number[i]==85)
			{
				break;
			}
			
			System.out.println(number[i]);
			i++;
		}
		
		

		
		

	}

}
