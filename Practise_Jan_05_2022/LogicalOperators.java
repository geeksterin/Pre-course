package Practise_Jan_05_2022;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 100;
		int num3 = 75;
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println(num1);
		}
		else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2);
		} else {
			System.out.println(num3);
		}
		
		
		int num = 10;
		if (!(num==10)) {
			System.out.println("hello");
		}else {
			System.out.println("welcome");
		}
		
		
	}

}

/*
 * AND, OR, NOT
 * 
 * AND - &&
 * 
 * RS  LS   goes to President
 * 
 * T   F     F
 * F   F     F
 * F   T     F
 * T   T     T
 * 
 * 
 * RS  LS  President   Law
 * T   T     F          F
 * T   T      T          T
 * 
 * 
 * 
 * ------------------------
 * 
 * OR - condition -- ||
 *
 * bring noodles or bring momos
 * 
 * T  T  --->  T
 * T  F --> T
 * F   T  -> T
 * F   F  --> F
 * 
 * 
 * NOT -- !
 * 
 * True  --> False
 * False --> True
 * 
 * 
 */