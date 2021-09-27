package FirstHand_Sep_25;

public class prime {
	public static void main(String args[]) {
		
		// sum of N numbers = 100
		// 1+ 2 + 3 + ... 100
		// n (n+1)/2 == 100 * 101 /2 = 101 * 50 = 5050
		
	/*	int num = 10;
		int count_of_factors = 0;
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count_of_factors = count_of_factors + 1;
			}
		}
		
		if(count_of_factors == 2) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
		*/
		
		int n=10,i;
		boolean isPrime = true;
		for(i=2;i<n;i++)
		{
			if (n%i == 0){
			System.out.println(n+"is not a prime number");
			isPrime = false;
			break;
			}
		}
		
		
		if(isPrime == true) {
			System.out.println(n+"is a prime number");
		}
	}

}

// prime number :=

/*
 * 
 * calculate the number of factors. 
 * and if the count of factors is more than 2, then it is not a prime
 * otherwise a prime
 *
 * 
 * 10 -- 1,2,5,10
 * 
 * 6 - 1,2,3,6
 * 
 * 5 -- 1,5 -- 1 and the number itself
 * 
 * 7 -- 1,7
 * 
 * 100 - 1,2,4,5, 10, 20, 25, 50, 100
 * 
 * 
 * 
 * 
 */