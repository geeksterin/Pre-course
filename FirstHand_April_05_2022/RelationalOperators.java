package April_05_2022;

public class RelationalOperators {

	public static void main(String[] args) {
		

		System.out.println(100==100);//true
		System.out.println(1==100);//false
		System.out.println(100==1000);//false
		
		
		System.out.println(100!=100);//false
		System.out.println(1!=100);//true
		System.out.println(100!=1000);//true
		
		
		System.out.println(100>100);//false
		System.out.println(1>100);//false
		System.out.println(10000>10);//true
		
		
		System.out.println(100<100);//false
		System.out.println(1<100);//true
		System.out.println(10000<10);//false
		
		
		// greater than OR equal to
		// 100>100 OR 100 == 100
		System.out.println(100>=100);//true
		System.out.println(1>=100);//false
		System.out.println(10000>=10);//true
		
		// less than OR equal to
		// 100<100 OR 100 == 100
		System.out.println(100<=100);//true
		System.out.println(1<=100);//true
		System.out.println(10000<=10);//false
	}

}
/*
 * Relational operators
 * 
 * Operators that tell the 
 * relationship between two values
 * 
 * Their output/ result is always --> true/false
 * 
 * ==  Equal to
 *  !=  not equal to
 *  > 
 *  <
 *  >=
 *  <=
 * 
 * 
 */