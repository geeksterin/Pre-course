package Practise_Nov_14;

public class whileAndDoWhileLoops {

	public static void main (String args[]) {
		
		// for loop and while are also called as
		// Entry controlled loop
		/*int num = 500;
		while (num<=100) {
			System.out.println(num);
			num = num+1;
		}*/
		
		
		// Exit controlled loop
		int num2 = 500;
		do {
			System.out.println(num2);
			num2 = num2+1;
		} while (num2<=100);
	
	}
}

/*
 * 
 * 
 * 1. Find whether a number is perfect square
 * 2. Calculate the number of digits in a give number
 * 1000099 - 7
 * 99000 - 5
 * 0007 - 1
 * 
 * 
 * initialisation
 * while (condition){
 *   repeated code here
 *   
 *   updation
 * 
 * }
 * 
 * 
 * for (initialisation; condition; updation){
 *   repeated code here
 * }
 * 
 */