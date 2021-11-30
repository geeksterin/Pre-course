package Practise_Nov_26;

public class LogicalOperators {
	public static void main(String args[]) {
		int num1 = 500;
		int num2= 1000;
		int num3 = 200;
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.print(num1);
		}
		else if (num2 >= num1 && num2 >= num3) {
			System.out.print(num2);
		}else {
			System.out.print(num3);
		}
	}
}
/*
 * AND, OR, NOT
 * 
 * AND
 *  
 *  if the shop is open AND they are making Pizza
 *  	bring pizza
 * 
 * 
 * if the shop is open   ; they are making Pizza
 * 
 * AND --- &&
 * condition 1   condition 2      Result
 *     False        True           false
 *     false        false          false
 *     true         false          false
 *     true         true		   true
 * 
 * 
 * 
 * OR operator --- ||
 * 
 * if you get momos, bring momos  OR if you get noodles, bring noodles
 * condition 1   condition 2      Result
 *     False        True           True
 *     false        false          false
 *     true         false          true
 *     true         true		   true
 *     
 *     
 *     
 *     NOT operator  -- !
 *     true    --- !true -- false
 *     false ---- !false -- true
 * 
 * 
 * 
 * 
 */