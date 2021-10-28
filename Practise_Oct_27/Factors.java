package Practise_Oct_27;

public class Factors {

	public static void main (String args[]) {
		
		// print all factors of a number
		
		int num = 100;
		
		for (int i = 1; i <= num; i+=1) {
			
			if(num % i ==0) {
				System.out.println(i);
			}
		}
		
	}
}
