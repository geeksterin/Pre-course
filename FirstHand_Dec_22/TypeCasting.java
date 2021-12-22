package FirstHand_Dec_22;

public class TypeCasting {
	public static void main(String[] args) {
		
		// small --> big
		// automatic/ implicit/ widening typecasting
		byte age = 29;
		int new_age = age;
		System.out.println(new_age);
		
		float perc = 91.4f;
		double new_perc = perc;
		System.out.println(new_perc);
		
		// big --> small
		// manual/ explicit / narrowing
		int sal = 30000;
		short new_sal = (short)sal;
		System.out.println(new_sal);
		
		float percentage = 91.4f;
		int new_percentage = (int) percentage;
		System.out.println(new_percentage);
		
		int val = 900000;
		short new_val = (short)val;
		System.out.println(new_val);
		
		char x = 'a';
		int k = x;
		System.out.println(k);
		
		//boolean y = true;
		//int z = (int)y;
		// System.out.println(z);
	}
}
