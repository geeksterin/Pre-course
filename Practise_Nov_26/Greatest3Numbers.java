package Practise_Nov_26;

import java.util.*;

public class Greatest3Numbers {

     public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
       
        if (num1 >= num2 && num1 >= num3) {
            System.out.print(num1);
        }
        else if (num2 >= num1 && num2 >= num3) {
            System.out.print(num2);
        }else {
            System.out.print(num3);
        }
    }
}
