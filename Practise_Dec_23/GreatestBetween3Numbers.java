package Practise_Dec_23;

public class GreatestBetween3Numbers {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 100;
		int num3 = 100;
		
		
	
		if(num1 >= num2 && num1 >= num3) {
			System.out.print(num1);
		}
		else if(num2 >= num1 && num2 >= num3) {
			System.out.print(num2);
		}else {
			System.out.print(num3);
		}
	}
}
