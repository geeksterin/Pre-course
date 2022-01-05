package Practise_Jan_05_2022;

public class OddEven {

	public static void main(String[] args) {
		//int x = 16/3; //5;
       // int y = 15 /3 ; //5
		//int z = 17/3;// 5.666 => 5
		
		// modulo operator -- % --> remainder
		
		
		// int a = 15 % 3; //0
		// int b = 16 % 3; //1
		// int c = 17 % 3; //2
		
		
		int num = 24;
		if (num % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
		// print all even numbers from 1 to 100
		
		for (int i = 1; i <=100; i= i+1) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		
		
		
	}

}

// if a number is divisible by 2, it is even

// x is divisible by y, if the remainder is 0