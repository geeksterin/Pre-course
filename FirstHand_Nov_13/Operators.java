package FirstHand_Nov_13;

public class Operators {
	
	public static void main (String args[]) { 
		
		/* 
		 boolean x = 100 == 100; // true
		
		if(1000>10) {
			//
		}
		*/
		
		System.out.println(100==100); // true
		System.out.println(100==1); // false
		System.out.println(10==1000); //false
		
		System.out.println(10>1000); //false
		System.out.println(1000>1000); //false
		System.out.println(10110 > 1000); //true
		
		System.out.println(10 < 1000); //true
		System.out.println(1000 < 1000); //false
		System.out.println(10110 < 1000); //false
		
		System.out.println(10>=1000); //false
		System.out.println(1000>=1000); //true
		System.out.println(10110 >= 1000); //true
		
		System.out.println(10 <= 1000); //true
		System.out.println(1000 <= 1000); //true
		System.out.println(10110 <= 1000); //false
		
		System.out.println(10 != 1000); //true
		System.out.println(1000 != 1000); //false
		System.out.println(10110 != 1000); //true
		
	}

}

// Relational operators
/*
 * 
 * ==  equal to --- if things are equal -- true,  otherwise returns false
 * 
 * > greater than
 * < less than
 * 
 * >=  greater than or equal to
 * <= less than or equal to
 * 
 * !=  not equal to -- if things are not equal, return true  else rrturn false
 * 
 * 
 */