// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        
        // 1. Take a number as input from user and print its all factors
        // 2. Take a number as input and print the total count of its factors
        // 3. Take a number as input and print whether its prime or not       
        int num = 100;
        int count = 0;
        
        for (int i = 1; i <=num; i= i+1 ){
            if (num % i == 0){
               count = count+1;
            }
        }
        
        if (count==2){
             System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
       
    }
}

12321

/*

10 -- 1,2,5,10  -- 4
6 -- 1,2,3,6 -- 4
20 - 1,2,4,5,10,20  -- 6
30 - 1,2,3,5,6,10,15,30 -- 8

100 - 1,2,4,5,10,20,25,50,100  - 9

25 - 1,5,25 -- 3

9 - 1,3,9 -- 3

81 - 1,3,9,27,81 -- 5

7 - 1, 7  -- 2
11 - 1,11  -- 2

*/