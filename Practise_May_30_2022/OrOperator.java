import java.util.*; // line 1

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in); // line 2
        
        int num = sc.nextInt();
        
        if (num > 0 ||  num % 2 == 0){
            System.out.println("Hello");
        }
        else if (num < 0 || num % 2 != 0){
            System.out.println("Hi");
        }else{
            System.out.println("Welcome");
        }
   
    }
}
// Input a number and 
// if the number is Positive OR Even, Print "Hello"
// else if the number is Negative OR Odd, Print "Hi"
// else 
 // print Welcome