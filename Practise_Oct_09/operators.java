package PrecourseBeta;

public class operators {

	public static void main (String args[]) {
		
		int num1 = 100;
		int num2 = 30;
		int num3 = 50;
		
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1);
		}else if (num2 > num1 && num2 > num3) {
			System.out.println(num2);
		}else {
			System.out.println(num3);
		}
		
		
		
		
		
		
		
		
		int my_num = 10;
		System.out.println(my_num); // 10
		my_num = my_num + 5;  // my_num += 5;
		System.out.println(my_num); //15
		
		
		int my_num2 = 100;
		System.out.println(my_num2); // 100
		my_num2 = my_num2 / 5;    // my_num2 /= 5;
		System.out.println(my_num2); //20
		
		
		int my_num3 = 50;
		System.out.println(my_num3); // 50
		my_num3 = my_num3 *30;  // my_num3 *= 30;
		System.out.println(my_num3); //250
		
		int my_num4 = 30;
		System.out.println(my_num4); // 30
		my_num4 = my_num4 - 5;  //my_num4 -= 5;
		System.out.println(my_num4); //25
		
	}
}

/*
 * 
 * if (shop is open AND they are making jalebis){
 *    buy jalebis
 * }
 * AND operator  --- &&
 * condition1  condition2   Result
 *  True        True          True
 *  False       True          False
 *  True        False         False
 *  False	    False         False
 * 
 * 
 * 
 * get momos or get noodles
 * 
 * OR operator
 * condition1  condition2   Result
 *    T           T           T
 *    T           F           T
 *    F           T           T
 *    F           F           F
 * 
 * 
 * 
 */