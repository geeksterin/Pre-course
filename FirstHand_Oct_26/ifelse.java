package FirstHand_Oct_26;

public class ifelse {
	public static void main (String args[]) {
		int num1 = 150;
		int num2 = 100;
		
		// print the greater number	
		if (num1 > num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
		
		
		System.out.println(100 > 10); //true
		System.out.println(10 > 50); //false
		System.out.println(10 < 50); //true
		System.out.println(100 < 50); //false
		System.out.println(10 == 50); // false
		System.out.println(10 == 10); //true
		
		System.out.println(10 != 50); // true
		System.out.println(50 != 50); //false
		
		
		System.out.println(10 >= 50); // false
		System.out.println(50 >= 50); //true
		System.out.println(100 >= 50); //true
		
		
		System.out.println(10 <= 50); // true
		System.out.println(50 <= 50); //true
		System.out.println(100 <= 50); //false
	}
}

/*
 *
 *  Relational operators in JAVA
 *  
 *  >  greater than
 *  < less than
 *  == equal to
 *  != not equal to
 *  >= greater or equal to 
 *  <= less than or equal to
 * 
 * 
 * 
 * 
 * if (name is Rahul){
 *   turn on your video
 * }otherwise{
 *   turn on your mic
 * }
 * 
 * 
 * if (condition){
 * 	 perform action 1
 * }else{
 *   perform action 2
 * }
 * 
 * 
 * 
 * 
 */