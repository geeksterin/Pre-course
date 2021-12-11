package Practise_Dec_10;

public class WhileLoopAndDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		for (int num = 1; num <= 500; num = num+1) {
			System.out.println(num);
		}
		 * */
		
		// entry controlled loop
		for (int num3 = 1000; num3 <= 500; num3 = num3+1) {
			System.out.println(num3);
		}
		
		
		int num = 1000;
		while (num <= 500) {
			System.out.println(num);
			num = num + 1;
		}
		
		
		
		// exit controlled loop
		int num2 = 1000;
		do {
			System.out.println(num2);
			num2 = num2 + 1;
		} while (num2 <= 500);
	}

}
/*
 * 
 * 
 
  initialisation
  while (condition){
   // repeated code
    // updation
  }
 

for (initialization; condition ; updation){
 *    // repeated code 
 *  }
*/