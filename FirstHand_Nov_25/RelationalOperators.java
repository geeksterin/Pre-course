package FirstHand_Nov_25;

public class RelationalOperators {

	public static void main(String args[]) {
		

	   System.out.print(100 == 100); // true
	   System.out.print(500 == 100); // false
	   System.out.print(500 == 50); // false
	   
	   System.out.print(100 > 100); //false 
	   System.out.print(500 > 100); // true
	   System.out.print(50 >  500);// false
	   
	   System.out.print(100 < 100); //false 
	   System.out.print(500 < 100); // false
	   System.out.print(50 < 500); // true
	   
	   System.out.print(100 >= 100); //true 
	   System.out.print(500 >= 100); // true
	   System.out.print(50 >=  500);// false
	   
	   System.out.print(100 <= 100); //true 
	   System.out.print(500 <= 100); // false
	   System.out.print(50 <= 500); // true
	   
	   System.out.print(100 != 100); //false 
	   System.out.print(500 != 100); // true
	   System.out.print(50 != 500); // true
	   
		
	}
}

/*
 * 
 * ==  if both values are equal, returns true otherwise 
 * return false
 * 
 * > 
 * <
 * >=
 * 
 * <=
 * !=   if both values are equal, returns false otherwise 
 * return true
 * 
 * 
 * 
 */