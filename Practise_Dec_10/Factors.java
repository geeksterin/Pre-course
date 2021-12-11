package Practise_Dec_10;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 20;
		int count_of_factors = 0;
		
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count_of_factors = count_of_factors +1;
			}
		}
		
		System.out.println(count_of_factors);
	}

}
/*
 *  6 --> 1,2,3,6 === 4
 *  10 --> 1,2,5,10   === 4
 *  20 --> 1,2,4,5,10,20 == 6
 *  
 *  9 --> 1,3,9 === 3
 *  
 *  100 --> 1,2,4,5,10,20,25,50,100 == 9
 *  
 *  3 --> 1,3  == 2 
 *  17 --> 1,17  == 2
 *  49 --> 1,7,49  == 3
 * 
 *  
 * 
 * 
 */