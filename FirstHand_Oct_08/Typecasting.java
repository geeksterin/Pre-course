package PrecourseBeta;

public class Typecasting {
	
	public static void main(String args[]) {
			
		// automatic / widening
		short old_age = 29;// old_age stores "short" datatype
		int new_age = old_age;// new_age is "int" datatype which is bigger
		
		System.out.println(old_age);
		System.out.println(new_age);
		
		int salary = 10000;
		double new_salary = salary;
		System.out.println(salary); //10000
		System.out.println(new_salary); //10000.0
		
		
		//byte number = 5; 
		//number *  // 50000
		
		
		// narrowing / explicit
		
		int cash = 20000;
		short new_cash = (short) cash;
		System.out.println(cash);
		System.out.println(new_cash);
		
		// explicit type casting
		int money = 2000000;
		short new_money = (short) money;
		System.out.println(money);
		System.out.println(new_money); //-31616 -- garbage value
		
		
		float num = 20.95f;
		int my_num = (int) num;
		System.out.println(num); // 20.95 => 20
		System.out.println(my_num); //20
	}
}

/*
 *  data_type  name_of_variable = data/value
 *  
 *  if variable is a container, data_type is the type of the container.
 *  
 *  
 * 
 */

// 29 is the data, age is the variable

// A variable name can have
// A-Z, a-z, 0-9, _ , $

// @ ! & * -- invalid

// there can be no space between the variable name

// rule says that the name of the variable cannot start with the number

//abcXYZ012$
// $zyc123
// _djefhejfh
// 123abcd_ --> invalid



