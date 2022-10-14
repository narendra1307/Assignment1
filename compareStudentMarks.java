package Assignment1_8thOct2022;

public class compareStudentMarks {

	public static void main(String[] args) {
		
//		Write a program to print below students marks who have scored above 80
//		Example- 78,12,89,55,35
//		Output-  78,89
		
		int[] marks = {78,12,89,55,35};
		
		for (int i=0 ; i<marks.length ; i++) 
		{
			if(marks[i]>=70)
			{
				System.out.println(marks[i]);
			}
		}

		
		
		
	}

}
