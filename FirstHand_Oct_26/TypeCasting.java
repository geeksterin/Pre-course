package FirstHand_Oct_26;

public class TypeCasting {
	public static void main (String args[]) {
		
		// automatic/widening
		byte age = 29; //byte
		int new_age = age; // bigger container
		System.out.println(new_age); //29
		
		// manual / narrowing
		int salary = 30000;
		short new_salary = (short) salary;
		System.out.println(new_salary); //30000
		
		
		float percentage = 85.9f;
		int new_percentage = (int) percentage;
		System.out.println(new_percentage); //85
	}
}
