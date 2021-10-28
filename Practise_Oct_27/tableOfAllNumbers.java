package Practise_Oct_27;

public class tableOfAllNumbers {

	public static void main (String args[]) {
		
		for (int num = 1; num <=10; num+=1) {
		
				for (int i = 1; i<=10; i+=1) {
					System.out.print(num*i);
					System.out.print("\t");
				}
				System.out.print("\n");
		}
	}
}
