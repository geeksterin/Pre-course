package April_06_2022;

public class Loops {

	public static void main(String[] args) {
		// print all numbers from  1 to 5
		
// A->B->C->D->B->C->D->B->C->D->B->C->D->B->C->D->B
		// num --> 1x  2x  3x 4x  5x  6
		int num;
		
		    //line A   line B      line D
		for (num = 1; num <= 5; num = num+1) {
			System.out.println(num); // line C
		}
		
		
	//	System.out.println(x);
		
		System.out.println(num); //???
		// 5, 1, 6, null
		// 5 --> last value of num
		// 1 --> XXX -
		// 0 --> default value for int --. XXX
		// null --> XXX
		// 6 -- right ans
	
		//1<=5 --> true
		// 2<= 5 -> true 
		// 3 <=5 -> true
		// 4<= 5 -> true
		// 5 <=5 -> true
		// 6 <= 5 --> false
		
		
		
		//OUTPUT --> 
		//1 
		//2 
		//3
		//4
		//5
		
		
	}
}
/*
 * 
 *Loops - For, while, do-while
 *
 *  for (assignment; condition; updation){
 *   // repeating code here
 *  }
 * 
 * 
 * 
 */