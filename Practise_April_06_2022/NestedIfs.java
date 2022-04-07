package April_06_2022;

public class NestedIfs {

	public static void main(String[] args) {
		
		// we have to print whether :-
		// - a number is :-
		//1.  odd and positive
		//2.  even and positive
		//3. odd and negative
		//4. even and negative
		//5. zero
		
		int num = 0;
		
		if (num > 0) { // -3>0 --> true
		// positive
			if (num % 2 == 0) { //--> true
				System.out.print("Even and Positive");
			    
			}else {
				System.out.print("Odd and Positive");
			}
		}
		else if (num <0) { // -3<0--> true
			//negative
			if (num % 2 == 0) { //-1==0 //false
				System.out.print("Even and negative");
			}else {
				System.out.print("Odd and negative");
			}
			
		}else {
			//zero
			System.out.print("zero");
		}
		
	}
}


/*
 * 5 --> odd and positive
 *  19 --> odd and positive
 *  
 *  24 --> even and positive
 *  
 *  100 --> even and positive
 *  
 *  -3 -> odd and negative
 *  
 *  -20 -> even and negative
 *  
 *  0 ---> zero
 * 
 * 
 * 
 */