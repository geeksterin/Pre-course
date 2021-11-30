package Practise_Nov_26;

public class Factors {
	public static void main(String args[]) {
		
		int num = 25;
		int count_of_factors = 0;
		
		
		for (int i = 1; i<= num; i++) {
			if(num % i == 0) {
				count_of_factors = count_of_factors +1;
			}
		}
		
		
		System.out.print(count_of_factors);
		
		if(count_of_factors == 2) {
			System.out.print("Prime");
		}else {
			System.out.print("Not Prime");
		}
		
	}
}

// 2 --> 1,2 ==> 2
// 3 --> 1,3 ==> 2
// 7 --> 1,7 ==> 2
// 19 --> 1,19 ==> 2
// 6 --> 1,2,3,6 ==> 4
// 10 --> 1,2,5,10 ==> 4
// 100 --> 1,2,4,5,10,20,25,50,100 => 9
// 9 --> 1,3,9 ==> 3
// 25 --> 1,5,25 ===> 3

