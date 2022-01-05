package Practise_Jan_05_2022;

public class CountOfFactors {

	public static void main(String[] args) {
		
		// write a program that prints 
		//count of factors of a number
		
		int num = 20;
		int count = 0;
		
		for (int f = 1; f <= num; f++) {
			
			if(num % f ==0) {
				count = count + 1;
				
			}
			
		}
		
		System.out.println(count);
		
		
		/*
		 * if(count ==2){
		 * System.out.println("prime");
		 *} 
		 * else{
		 * System.out.println("not prime");
		 * }
		 * */
	}
}

/*
 * if x % y ==0, y is a factor of x
 * 
 * 6 --> 1,2,3,6  --> 4
 * 
 * 10 --> 1,2,5,10 --> 4
 * 
 * 20 --> 1,2,4,5,10,20 -->6
 * 
 * 25 --> 1,5,25 --> 3
 * 
 * 100 --> 1,2,4,5,10,20,25,50,100  --> 9
 * 
 * 9 --> 1,3,9 --> 3
 * 
 * 81 --> 1,3,9,27,81 --> 5
 * 
 *  7 --> 1,7 --> 2
 *  
 *  19 --> 1,19 --> 2
 *  
 *  5 --> 1,5 --> 2
 * 
 * 
 * 
 */