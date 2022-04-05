package April_05_2022;

public class LogicalOperators {

	public static void main(String[] args) {

		System.out.println(true && false);//f
		System.out.println(false && false);//f
		System.out.println(false && true);//f
		System.out.println(true && true);//t
		
		System.out.println(true || false);//t
		System.out.println(false || false);//f
		System.out.println(false || true);//t
		System.out.println(true || true);//t
		
		
		System.out.println(!true);//false
		System.out.println(!false);//true
		
		
	}

}

/*
 * Logical operators -- True/false
 * AND, OR, NOT
 * AND -- && 
 * 
 * if the shop is open, ---c1
 * AND they are making Jalebis, --c2
 * bring Jalebi for me.
 * 
 * c1  c2  result
 * F   F      F
 * F   T      F
 * T   F      F
 * T   T      T
 * 
 *       LS, RS, President
 *       
 *       
 *       
 *       OR operator -- ||
 *       
 *       
 *       either bring Noodles, --c1
 *       OR bring Momos --c2
 *       
 *       c1  c2   result
 *       T    F     T
 *       F    T     T
 *       T    T     T
 *       F    F     F
 *       
 *       
 *       
 *       NOT operator --!
 *       
 *     c1  result
 *     True  false
 *     false  true
 *     
 *     
 * 
 * 
 * */
