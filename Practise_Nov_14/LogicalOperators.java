package Practise_Nov_14;

public class LogicalOperators {
	public static void main (String args[]) { 
		
		int num1 = 100;
		int num2 = 200;
		int num3 = 300;
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println(num1);
		}else if(num2 >= num1 && num2 >= num3) {
			System.out.println(num2);
		}else {
			System.out.println(num3);
		}
		
		
		int num4 = 10;
		if(!(num4==10)) {
			System.out.println("Hello");
		}else {
			System.out.println("Welcome");
		}
		
	}

}

/*
 * 
 * AND, OR, NOT
 * 
 * 
 * 
 * AND -->  &&
 * 
 * if the shop is open AND they are making Jalebis,
 * bring Jalebi for me.
 * 
 * Condition1  condition2    Result
 *   False      False         False
 *   False      True          False
 *   True       False         False
 *   True       True		  True
 * 
 * 
 * 
 * 
 * OR --> ||
 * Bring Jalebi or Bring Laddoo
 *  Condition1  condition2    Result
 *   False      False         False
 *   False      True          True
 *   True       False         True
 *   True       True		  True
 * 
 * 
 * 
 * NOT --> !
 * 
 * Condition   Result
 *  True        False
 *  False       True
 * 
 * 
 * 
 * 
 * */
