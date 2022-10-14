package Assignment1_8thOct2022;

public class averageOfNumber {

	public static void main(String[] args) {
		double[] numbers= {	10,90.78,111,8989,7876};
		
		double sum=0;
		
		double average;
		
		
		for(int i=0 ;i<5;i++)
		{
			sum = sum+ numbers[i];
		}
		
		average = sum/numbers.length;
		
		System.out.println(average);

	}

}
