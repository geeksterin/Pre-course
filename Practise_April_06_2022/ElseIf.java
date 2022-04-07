package April_06_2022;

public class ElseIf {

	public static void main (String args[]) {
		
		//greatest between 3 numbers
		
		int num1 = 20; //20
		int num2 = 20;//20
		int num3 = 20;//10
		
		// 20>=20 && 20>=20 -->true
		if (num1 >= num2 && num1 >= num3) {
			System.out.print(num1);//20
		}
		else if (num2 >= num1 && num2 >= num3) {
			// 20>20 && 20>10 --> false
			System.out.print(num2);
		}else {
			System.out.print(num3);
		}
		
	}
}

/*
 * 
 * if (you get dosa) -- condition1
 *   bring dosa
 *   
 * else if( you get Uttapam) -- condition2
 *   bring Uttapam
 *   
 *   
 * else if (you get vada) -- condition3
 *   bring vada
 *   
 * else
 *     bring idli
 * 
 * 
 * 
 */