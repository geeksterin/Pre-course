package FirstHand_Nov_13;

public class Typecasting {
	 public static void main (String args[]) { 
		 
		 // Automatic/Widening type casting
		 short salary = 30000;
		 int annual_salary = salary * 12; //3,60,000
		 
		 int pincode = 800001;
		 long new_pincode = pincode;
		 
		 System.out.println(annual_salary);
		 System.out.println(new_pincode);
		 
		 
		 // manual/ narrowing/explicit typecasting
		 short date = 11;
		 byte new_date = (byte) date;
		 System.out.println(new_date);
		 
		 
		 float percentage = 91.99f;
		 int new_percent = (int) percentage;
		 System.out.println(new_percent);
	 }
}
