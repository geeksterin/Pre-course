package Practise_Nov_14;

public class OddEven {

	public static void main (String args[]) {
		
		// find whether a no. is odd or even
		
	   //  15 % 2 = 1
		
		// 30 % 6 = 0
		
		// 30 % 7 = 2
		
		// 10 % 7 = 3
		
		// 6 % 10 = 6
		
		// num % 2  == 0, number is even, else odd
		
		
		int num = 311;
		
		if(num % 2 ==0) {
			System.out.print("Even");
		}else {
			System.out.print("Odd");
		}
	}
}
// divide any number by 2

// if no. is divisible by 2, it is even ... otherwise odd

// x / y, if the remainder is 0, then it is divisible

// to get the remainder, we use something called  a modulo operator

 //   % symbol.