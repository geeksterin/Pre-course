import java.util.*; // line 1

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in); // line 2
        
        // Take a number as input from user as "limit" and print all multiples of 3 and 5   upto limit

        int limit = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        for (int num =1; num <=limit; num = num+1){
        
            if (num%num1 ==0 || num%num2 ==0){
                System.out.println(num);
            }
        
        }
    
   
    }
}
// Input a number and 
// if the number is Positive OR Even, Print "Hello"
// else if the number is Negative OR Odd, Print "Hi"
// else 
 // print Welcome


/*
3
5
6
9
10
12
15
18
20
21

*/