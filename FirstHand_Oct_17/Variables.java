package PrecourseGama_FirstHand_Oct_17;

public class Variables {

	public static void main(String args[]) {
		byte age = 30;
		int pincode = 122001;
		long phone_number = 3829478347890L;
		short salary = 30000;
		
		char section = 'D';
		boolean is_indian = true;
		
		float percentage = 85.67f;
		double data = 2881278.2673623762d;
		
		String name = "Vikas Ranjan 34674676346 %@!$%#$%@#$%";
		
		System.out.println(age);
		System.out.println(pincode);
		System.out.println(phone_number);
		System.out.println(salary);
		System.out.println(section);
		System.out.println(is_indian);
		System.out.println(percentage);
		System.out.println(data);
		System.out.println(name);
		System.out.println(age + " ----  " + pincode + " ----  " + name);
		
		// widening / automatic
		byte my_age = 25;
		int new_age = my_age;
		System.out.println(new_age);
		
		// narrowing/manual
		int myage_2 = 21;
		short newage_2 = (short) myage_2;
		System.out.println(newage_2);
		
		float percentage_2 = 91.99f; //91.45  91.999
		int new_percentage = (int) percentage_2; //91
		System.out.println(new_percentage);
	}
}

// 29
// Variable is a container to store some data;

/*
 * 
 *
 * 29
 * 122001
 * 943902830902
 * 
 * Vikas
 * 
 * hdjhefj , jeflkje , Gurgaon
 * 
 * 27/05/1992
 * 
 * 92.40
 * 
 * Yes/ no
 * 
 * true/false
 * 
 * D
 * 
 * 
 *
 * 
 * type_of_variable  name_of_variable = value/data;
 * 
 * 
 * 
 * A-Z, a-z, 0-9, $, _
 * 
 * 
 * @ # * () -- wrong
 * 
 * 
 * vikas ranjan -- wrong
 * 
 * vikasranjan
 * vikas_ranjan
 * vikasRanjan
 * 
 * 
 * it cannot start with a number
 * 
 * abcd190
 * 
 * _abcd190
 * 
 * $abcd190
 * 
 * 19Abcd --wrong
 * 1fefefe -- wrong
 * 
 * 
 * we cannt keep any reserve keyword
 * 
 */