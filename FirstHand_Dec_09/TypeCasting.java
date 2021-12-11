package FirstHand_Dec_09;

public class TypeCasting {
	public static void main (String args[]) {
		
		// smaller container to bigger container
		// short --> int
		short salary = 20000;
		// int annualSalary = salary * 12;
		// System.out.println(annualSalary);
		int annualSalary = salary;
		System.out.println(annualSalary);
		
		// bigger container to smaller container
		// int --> short
		int salary2 = 20000;
	    short extra = 5000;
		short annualSalary2 = (short) salary2; //25000
		System.out.println(annualSalary2+extra);
		
		float f = 91.4f;
		double f2 = f;
		System.out.println(f2);
		
		float a = 92.99f;
		int a2 = (int) a;
		System.out.println(a2); // 92
	}
}
