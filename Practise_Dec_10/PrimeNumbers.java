package Practise_Dec_10;

public class PrimeNumbers {
	public static void main(String[] args) {
		int num = 20;
		int count_of_factors = 0;
		
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count_of_factors = count_of_factors +1;
			}
		}
		
		
		if(count_of_factors ==2) {
			System.out.println("prime");
		}else {
			System.out.println("not a prime");
		}
	}
}
