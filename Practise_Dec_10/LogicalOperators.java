package Practise_Dec_10;

public class LogicalOperators {

	public static void main(String args[]) {
		
		int num1 = 900;
		int num2 = 700;
		int num3 = 300;
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println(num1);
		}else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2);
		}else {
			System.out.println(num3);
		}
		
	}
}

/*
 * 
 * AND, OR, NOT 
 * 
 * 
 * AND -- &&
 * 
 * if the shop is open AND if they are making Jalebi,
 * Bring Jalebi
 * condition 1   condition2      Result
 *   True  	      False           False
 *   False        True            False
 *   False        False           False
 *   True         True            True
 * 
 * 
 * 
 * 
 * OR operator -- ||
 * 
 * Either bring Jalebi or Bring gulabjamun
 * 
 *  condition 1   condition2      Result
 *     True        true            True
 *     True        false           True
 *     False       True             True
 *     False       false			false
 * 
 * 
 * 
 * NOT operator -- !
 * 
 * condition   result
 *  False	    true
 *  true        false
 * 
 * 
 * 
 * 
 */