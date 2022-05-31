// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int num = 99;
        /// print whether the number is even and positive, even and negative, odd and positive, odd and negative, zero
        if (num > 0){
            if (num%2 ==0){
                System.out.println("Even and Positive");
            }else {
                System.out.println("Odd and Positive");
            } 
        }else if (num < 0){
            if (num%2 ==0){
                System.out.println("Even and Negative");
            }else {
                System.out.println("Odd and Negative");
            } 
        }else{
             System.out.println("Zero");
        }
        
        /*
        if (num > 0 && num%2 ==0){
            System.out.println("Even and Positive");
        }else if (num > 0 && num%2 !=0){
            System.out.println("odd and Positive");
        } else  if (num < 0 && num%2 ==0){
            System.out.println("Even and Negative");
        }else if (num < 0 && num%2 !=0){
            System.out.println("odd and Negative");
        }else{
            System.out.println("Zero");
        }
        */
        
        
    }
}