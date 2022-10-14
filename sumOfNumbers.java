package Assignment1_8thOct2022;

public class sumOfNumbers {

	public static void main(String[] args) {
		double[] number = {10,90.78,111,8989,7876};
		
		double sum=0;
		
		for(int i=0 ; i<5 ; i++) {
			
			
			sum = sum+ number[i];
		}

       System.out.println(sum);
	}

}
