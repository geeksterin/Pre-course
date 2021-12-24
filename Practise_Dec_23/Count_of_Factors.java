package Practise_Dec_23;

public class Count_of_Factors {

	public static void main(String[] args) {
		
		int num = 30;
		int count_of_factors = 0;
		
		for (int i = 1; i<= num; i=i+1) {
			
			if(num%i == 0) {
				count_of_factors = count_of_factors + 1;
			}
		}
		
		System.out.print(count_of_factors);
	}
}

/*
 * WAP to check whether a number is a perfect square
 * WAP to count the number of digits in a number
 * 9178 -- 4
 * 89000 -- 5
 * 000089 -- 2 
 * 
 * 
 * 
 * 
 * 
 *  6 -- 1,2,3,6  = 4
 *  9 -- 1,3,9    = 3
 *  20 -- 1,2,4,5,10,20  = 6
 *  10 -- 1,2,5,10   = 4
 *  100 -- 1,2,4,5,10,20, 25, 50, 100 = 9
 *  25 -- 1,5,25 = 3
 *  64 -- 1,2,4,8, 16,32, 64 = 7
 *  81 -- 1,3,9,27, 81 = 5
 *  30 -- 1,2,3,5,6,10,15,30 = 8
 *
 *
 *  7  --  1, 7    = 2
 *   17 = 1, 17 = 2
 * 
 * 
 * 
 * 
 * 
 */