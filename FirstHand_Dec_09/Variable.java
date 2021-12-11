package FirstHand_Dec_09;

public class Variable {
	public static void main (String args[]) {
		
		// type_of_variable name_of_variable = value;
		
		 byte age = 29;
		 short salary = 20000;
		 int pincode = 800001;
		 long mobile = 9876154560L;
		 
		 float percentage = 91.45f;
		 double random = 237837.8293798378;
		 
		 char section_in_school = 'D';
		 boolean isIndian = true;
		 
		 String message = "Welcome to geekster";
		 
		 System.out.println(age);
		 System.out.println(salary);
		 System.out.println(pincode);
		 System.out.println(mobile);
		 
		 System.out.println(percentage);
		 System.out.println(random);
		 System.out.println(section_in_school);
		 System.out.println(isIndian);
		 
		 System.out.println(message);
	}
}

// variable -- container to store data
// 29

// we need a container to store things
// we need different type of containers 
// to store different things

/* 
 * 1. A variable name can only have 
 *  a - z , A-Z, $ , _ , 0-9
 *  
 *  2. cannot have any other symbol or space
 *  
 *  3. It cannot start with a number.
 *  
 *  4. we cannot use any reserved keyword
 * 
 * 
		 // v123ikas_age = 29
		// abAB123 
		// _abcAB12ab --> Valid
		
		// $ABCD123 --> VALID
		
		// ABCD$_ABCD --> valid
		
		// ABCD abcd --> not valid
		
		// 123abcd --> not valid
		
		
 * 
 */