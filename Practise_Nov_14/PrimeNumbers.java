package Practise_Nov_14;

public class PrimeNumbers {
	public static void main (String args[]) {
		
		int num = 10;
		int count_of_factors = 0;
		
		for (int i = 1; i<=num; i=i+1) {
			
			if(num % i ==0) {
				count_of_factors = count_of_factors + 1;
			}
		}
		
		if(count_of_factors == 2) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not Prime number");
		}
	}
}
// 20 - 4,5, 2, 10, 1, 20
// 36 - 1,36, 2,18, 4,9   6
// 25 - 1,5,25 = 3
// 36 - 1,2,3,4,6,9,12,18,36 = 9
// 10 -- 1,2,5,10 == 4
// 9 - 1,3,9 == 3
// 6 - 1,2,3,6 == 4
// 3 - 1,3 = 2
// 7 - 1,7 = 2
// 100 - 1,2,4,5,10,20,25,50,100 = 9