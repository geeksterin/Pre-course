package FirstHand_Nov_25;

import java.util.*;

public class TakeInput {
	public static void main(String args[]) {
		
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
       
		System.out.print("Welcome " + name);
	}
}
