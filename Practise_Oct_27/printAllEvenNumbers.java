package Practise_Oct_27;

public class printAllEvenNumbers {
	public static void main (String args[]) {
		
		// print all Even numbers from 1 to 100
		
		for (int i = 1 ; i <=100; i=i+1) {
			
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		

		for (int i = 1 ; i <=100; i=i+1) {
			
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
	}

}
