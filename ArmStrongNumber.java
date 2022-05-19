package week1.day2;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int input = 153;
		int sum = 0;
		int result;
		int number;
		number = input;
		
		while(number>0)
		{
			result = number%10;
			sum = sum + (result*result*result);
			number = number/10;
		}
		
		if(sum == input)
			System.out.println(input+ " is an Armstrong number");
		else
			System.out.println(input+ " is not an Armstrong number");
					
	}

}