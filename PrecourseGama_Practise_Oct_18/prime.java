package PrecourseGama_Practise_Oct_18;

public class prime {
	public static void main(String args[]) {
		 int num = 5;
		 int count = 0;
		    
		    for (int i = 1; i<= num; i = i+1) {
		    	if(num % i==0) {
		    		count = count + 1;
		    	}
		    }
		    if(count==2) {
		    	System.out.print("prime");
		    }else {
		    	System.out.print("not prime");
		    }
		    
	}
}
