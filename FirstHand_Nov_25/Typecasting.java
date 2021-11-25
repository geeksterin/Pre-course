package FirstHand_Nov_25;

public class Typecasting {
	public static void main(String args[]) {
		
		// Automatic/widening type casting
		byte age = 29;
		int new_age = age;
		System.out.println(new_age);
		
		float per = 91.4f;
		double new_per = per;
		System.out.println(new_per);
		
		
		// manual / narrowing
		int salary = 20000;
		short new_salary = (short) salary;
		System.out.println(new_salary);
		
		float p = 92.8f;
		int new_p = (int) p; // 92
		System.out.println(new_p); 
		
	}
}
