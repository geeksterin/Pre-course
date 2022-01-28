package Practise_Jan_28_2022;

public class RelationalOperators {
	public static void main(String[] args) {
		
		System.out.println(100 == 100);// true
		System.out.println(10 == 100);// false
		System.out.println(1000 == 1);// false
		
		System.out.println(100 != 100);// false
		System.out.println(10!=100);// true
		System.out.println(1000!=1);// true
		
		System.out.println(100>100); // false
		System.out.println(10>100);// false
		System.out.println(1000>1);// true
		
		// 100 >=
		// AND, OR, NOT
		
		// 100>100 OR 100 == 100
		
		// NOT(100==100)
		
		System.out.println(100>=100);// true
		System.out.println(10>=100);// false
		System.out.println(1000>=1);// true
		
		System.out.println(100<100); // false
		System.out.println(10<100);// true
		System.out.println(1000<1);// false
		
		System.out.println(100<=100);// true
		System.out.println(10<=100);// true
		System.out.println(1000<=1);// false
		
	}
}
/*
 * 
 * any relational operator will always give a boolean
 * 
 * ==, !=, > , >= , < , <=
 * 
 * is equal to , 
 * if equal , True
 * else False
 * 
 * 
 * 
 */