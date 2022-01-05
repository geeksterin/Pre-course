package FirstHand_Jan_04_2022;

public class TypeCasting {
	public static void main(String[] args) {
			
		// converting from one datatype to another
		
		//byte to int -- works
		//automatic/implicit
		byte age = 29;
		int new_age = age;
		System.out.println(new_age);
		
		// int to short --giving error
		// manual//explicit typecasting
		int some_age = 30;
		short new_some_age = (short) some_age;
		System.out.println(new_some_age);
		
		
		float p = 92.4f;
		double b = p;
		System.out.println(b);
		
		float k = 93.8f;
		int i = (int) k;
		System.out.println(i);
		
		
	}
}
