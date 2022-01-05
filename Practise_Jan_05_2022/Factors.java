package Practise_Jan_05_2022;

public class Factors {

	public static void main(String[] args) {
		
		// write a program that prints all factors of a number
		
		int num = 100;
		
		for (int f = 1; f <= num; f++) {
			
			if(num % f ==0) {
				System.out.println(f);
			}
			
		}
		
		
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
 * 
 * 
 */