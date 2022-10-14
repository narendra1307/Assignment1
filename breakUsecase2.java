package Assignment1_8thOct2022;

public class breakUsecase2 {

	public static void main(String[] args) {
		
//		Write a program which will break the current execution if it find “Selenium”
//		Input – [“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”]
		
		String[] words = {"Java","JavaScript","Selenium","Python","Mukesh"};
		int i=0;
		while(i<=words.length-1)
		{
			if(words[i].equalsIgnoreCase("Selenium"))
			{
				break;
			}
			
			System.out.println(words[i]);
			i++;
		}
		
		

		
		

	}

}
