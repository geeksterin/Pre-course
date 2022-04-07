package April_06_2022;

public class OddEven {

	public static void main(String[] args) {
		
		int num = 72;
		
		// if num is divisible by 2,
		// print even
		// else print odd
		
		if (num % 2 == 0) {
			System.out.print("Even");
		}else {
			System.out.print("Odd");
		}
		

	}

}

/*
 * IF a number is divisible by 2,
 * we say that is even.
 * Else it is Odd.
 * 
 * 
 * if x is divisible by y,
 *    the remainder of x/y will be 0.
 *    
 *    
 *   % -- modulus operator
 *   
 *   15 % 3 = 0
 *   16 % 3 = 1
 *   17 % 3  = 2
 *   
 *   18 % 4 = 2
 *   
 *   23 % 7 = 2
 *   
 *   35 % 8 = 3
 *   
 *   17 % 10 = 7
 *   
 *   4 % 9 = 4
 *   
 *   
 *   
 *   ----
 * 
 * 
 *   15 / 3 = 5, divisible
 *   
 *   16 / 3 = 5 , not div
 *   
 *   17/3 = 5 , not div
 * 
 * 
 *   3 )  15 (  5
 *        15
 *       ----
 *         0  
 *         
 *         
 *         3 )  16 (  5
 *              15
 *              ---
 *               1
 *               
 *               
 *               3 ) 17 ( 5
 *                   15
 *                   ---
 *                     2
 *               
 * 
 * 
 */