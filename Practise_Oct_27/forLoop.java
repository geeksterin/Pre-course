package Practise_Oct_27;

public class forLoop {
	public static void main (String args[]) {
		
		
		// print all numbers from 1 to 5
		
		for (int num=1;num<=1000;num+=1 ) {
			System.out.println(num);
		}
		
		// print numbers from 100 to 1
		for (int num2=100; num2>=1; num2-=1 ) {
			System.out.println(num2);
		}
		
		// print numbers from 100 to 1
		for (float num3=1; num3<=2; num3= num3+0.1f ) {
			System.out.println(num3);
		}
		
		
		// all odd no.s for 1 to 100
		for (int num4=1; num4<=100; num4+=2 ) {
			System.out.println(num4);
		}
		
		
		
	}

}

/*
 * 
 * whenever we have to do anything repeatedly, 
 * then we use loops
 * 
 * if we have to do anything again and again
 * 
 * for loop
 * 
 * for (initialisation ;  condition ; updation){
 *   // write repeated code here
 * }
 * 
 * 
 * 
 * int num = 10;
		num = num + 5; // num += 5;
		System.out.println(num); // 15
		
		
		num = num - 8; // num -=8;
		System.out.println(num); // 7
		
		
		num = num * 6; // num *=6;
		System.out.println(num); //42
		
		
		num = num / 3; // num /= 3;
		System.out.println(num); //14
 * 
 * 
 * 
 * 
 */