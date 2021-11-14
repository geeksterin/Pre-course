package FirstHand_Nov_13;

public class NestedIf {

	public static void main (String args[]) {
		
		int num = 0;
		
		if(num>0) {
			System.out.print("Positive number");
		} else if (num<0) {
			System.out.print("negative number");
		}else {
			System.out.print("zero");
		}
				
				
		
		
		int num2 = -200;
		
		if(num2>0) {
			if(num2 > 50) {
				System.out.print("more than fifity");
			}else if (num2 > 20) {
				System.out.print("more than 20");
			}else {
				System.out.print("less than 20");
			}
			
		}
		
		
			
	}
}

/*
 * 
 * 
 * if (you get noodles){
 *   bring noodles
 * }
 * else if (you get momos){
 *   bring momos
 * } else {
 *   bring samosa
 * }
 * 
 * 
 * 
 * if (name is rahul){
 *   turn on video
 * } else if (name is neha){
 *   turn on mic
 * } else if (name is Abhishek){
 *   turn off video
 * }else{
 *   turn off mic
 * }
 * 
 * 
 * 
 */