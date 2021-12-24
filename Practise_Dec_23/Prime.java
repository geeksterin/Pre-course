package Practise_Dec_23;

public class Prime {
public static void main(String[] args) {
		
		int num = 30;
		int count_of_factors = 0;
		
		for (int i = 1; i<= num; i=i+1) {
			
			if(num%i == 0) {
				count_of_factors = count_of_factors + 1;
			}
		}
		
		if(count_of_factors == 2) {
			System.out.print("prime");
		}else {
			System.out.print("not prime");
		}
		
	}
}
