package Practise_Oct_27;

public class PrimeNumber {

	public static void main (String args[]) {
		
		// print whether a number is prime
		
		int num = 17;
		int count_of_factors = 0;
		
		for (int i = 1; i <= num; i+=1) {
			
			if(num % i ==0) {
				count_of_factors = count_of_factors +1;
			}
		}
		
		if(count_of_factors == 2) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not Prime number");
		}
		
	
	}
}
