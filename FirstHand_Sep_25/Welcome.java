package FirstHand_Sep_25;

public class Welcome {

	public static void main (String args[]) {
		System.out.println("Hello World"); // prints Hello world message
		System.out.println("Welcome Everyone");
		
		// type name_of_var = value;
		
		// type age = 29;
		byte age = 29;
		short yearOfBirth = 1992;
		int pincode = 122001;
		long phoneNumber = 983207438787L;
		
		char section = 'B';
		String name = "Vikas Ranjan";
		
		String phn = "983567";
		int phnNum = 98765;
		
		
		int myInt = 9;
	    double myDouble = myInt; // 9.0
	    // automatic/widening
	    System.out.println(myDouble);
	    
		
	    // 10.1 = 10
	    // 10.99 = 10
	    
	    double myDoubleVar = 9.78d;
	    int myIntVar = (int) myDoubleVar;
	    System.out.println(myIntVar);// 9
	    
		//long 20000
	    
	    int myNum = 209;
	    // % == modulo operator
	    // 7 % 3 = 1
	    // 15 % 4 = 3
	    // 7 % 9 = 7
	    
	    if(myNum < 0) {
	    	System.out.println("negative");
	    }
	    
	    
	    
	    
	    if (myNum % 2 == 0) {
	    	System.out.println("even");
	    }else {
	    	System.out.println("odd");
	    }
	    
	    System.out.println(1 == 1); // true
	    System.out.println(1 == 10); // false
	    System.out.println(4 != 10); // true
	    System.out.println(50 != 50); // false
	    System.out.println(100 > 50); // true
	    System.out.println(50 < 500); // true
	    System.out.println(50 > 50); // false
	    System.out.println(50 < 50); // false
	    System.out.println(50 <= 50); // true
	    System.out.println(40 <= 50); // true
	    System.out.println(100 <= 50); // false
	    
	    int myNum2 = 51;
	    if(myNum2 == 0) {
	    	System.out.println("zero");
	    }
	    else if (myNum2 % 2 == 0) {
	    	System.out.println("even");
	    }else {
	    	System.out.println("odd");
	    }
	    
	    
	    int num1 = 0;
	    
	    if(num1 > 0  && num1 % 2 == 0) {
	    	System.out.println("even positive");
	    } else if(num1 < 0  && num1 % 2 == 0) {
	    	System.out.println("even negative");
	    }else if(num1 == 0) {
	    	System.out.println("zero");
	    }else if(num1 > 0  && num1 % 2 != 0) {
	    	System.out.println("odd positive");
	    } else {
	    	System.out.println("odd negative");
	    }
	    
	    
	    int num2 = -70;
	    
	    if(num2 > 0 || num2 < 0 ) {
	    	System.out.println("not zero");
	    }else {
	    	System.out.println("zero");
	    }
	    
	    
	    boolean value = true;
	    System.out.println(!value);
	    
	    
	    int n1 = 20; int n2 = 50;
	    if(n1>n2) {
	    	System.out.println(n1);
	    }else {
	    	System.out.println(n2);
	    }
	    
	    
	    // int n1 = 20; int n2 = 50; int n3 = 100;
	    
	}
}


/*
 * 
 *  ==  equal to 
 *  != not equal to 
 *  > greater than
 *  < less than
 *  >= greater than or equal to
 *  < = less than or equal to
 * 
 * 
 * 
 * 
 * 1 == 1
 * true
 * 
 * 
 * 
 * if (SC/ST quota){
 *    click page 1
 * }
 * else if (OBC quota){
 * 	click page 2
 * }
 * else if (PH quota){
 *  click page 3
 * }else{
 *  click page 4
 * }
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 * if (condition){
 * 			my action here
 * }else{
 * 			another action here
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * if (name is Rahul AND you stay in Delhi)
 * {
 * 			raise your hand;
 * }
 * 
 * 
 * 
 * if (Haldirams is open AND they are making JAlebis){
 * 
 *  bring jalebi for me;
 * }
 *
 *AND --  &&
 * condition A    Condition B    Output
 *  True  		   True				True
 *  False			True			False
 *  True		    false			false
 *  false			false			false
 * 
 * ---------------------------
 * 
 * 
 * if(you the shop has COKE OR shop has ThumbsUp){
 * 	bring it;
 * }
 * 
 * OR -- ||
 * condition A    Condition B    Output
 *  True  		   True				true
 *  False			True			true
 *  True		    false			true
 *  false			false			false
 * 
 * 
 * NOT operator
 * condition   output
 * TRUE			false
 * false		true
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * if name is rahul, raise your hand
 * 
 * 
 * if name is rahul, raise your hand otherwise turn on your video.
 * 
 * 
 * if  momos shop is open bring momos, otherwise bring noodles
 * 
 * */

// 29

//add
	// subtract
	// multiply
	// divide

// public
// static
// void
// String args[]

//print println