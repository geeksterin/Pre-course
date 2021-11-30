package Practise_Nov_26;

public class whileLoopsAndDoWhileLoops {
	public static void main(String args[]) {
		
		int num = 1000;
		while (num <= 100) {
			System.out.println(num);
			num = num + 1;
		}
		
		// for loop and while loop 
		// condition is checked at entry
		// entry controlled loop
		
		int num2 = 1000;
		do {
			System.out.println(num2);//1000
			num2 = num2 + 1; // 1001
		} while (num2 <= 100);
		
		// do while loop
		// condition is checked at exit
		// exit controlled loop
	}
}

/*
 * 
 *   initialisation
 *   while (condition){
 *   
 *      recurring code;
 *      
 *      updation;
 *   } 
 * 
 *
 * for(initialise; condition; updation){
 * 
 * 	  recurring code
 * }
 * 
 * 
 * 
 */