package FirstHand_Dec_22;

public class Variables {

	public static void main(String[] args) {
		
		
		// type_of_container name_of_container  = value/data
		
		   byte age = 29;
		   short monthly_salary = 20000;
		   int pincode = 800001;
		   long mobile_number = 9876543210L;
		   
		   float percentage = 94.2f;
		   double randomNumber = 100.78780;
		   
		   boolean isIndian = true;
		 //  boolean isMarried = false;
		   
		   char section = 'D';
		   
		   String message = " heloo bdwkjd 327632723yb ";
		   
		   System.out.println(age);
		   System.out.println(monthly_salary);
		   System.out.println(pincode);
		   System.out.println(mobile_number);
		   
		   System.out.println(percentage);
		   System.out.println(randomNumber);
		   
		   System.out.println(isIndian);
		   System.out.println(section);
		   
		   System.out.println(message);

		   
		   System.out.println(age + "  " + pincode + "  "+ message);
	}

}


// abc123 --> right
// 123abc --> wrong
// a123abc -->right
// vikas_name --> right
// _vikasname --> right
// $vikasname --> right
// vikas!name --> wrong
// vikas name --> wrong
// 1bc_$ --> wrong
// a1bc_$ --> right

// every variable has a name
// the name should be unique
// the variable name can have only A-Z, a-z, 0-9, $, _
// it cannot have any other symbol or a space in between
// it cannot start with a number



// age is 29;
//  a variable is a container to store some data

//1. to store anything, we need a container
// 2. to store different type of things, we need different containers

// store food in a utensil, lunch box, Container
// store some documents --> file, folder
// store some cash --> wallet, bag, purse, locker
// store some clothes --> cupboard, wardrobe, bag, almirah