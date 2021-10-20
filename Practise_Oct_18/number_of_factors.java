package PrecourseGama_Practise_Oct_18;

public class number_of_factors {
	public static void main(String args[]) {
		 int num = 9;
		 int count = 0;
		    
		    for (int i = 1; i<= num; i = i+1) {
		    	if(num % i==0) {
		    		count = count + 1;
		    	}
		    }
		    
		    System.out.print(count);
	}
}
