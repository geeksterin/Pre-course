public class Main {
    public static void main(String[] args) {
         
        int num1 = 300;
        int num2 = 1250;
        int num3 = 700;
        
        // print the greatest number in 3 numbers
        
        if (num1 >= num2 && num1 >= num3){
            System.out.println(num1);
        }
        
        else if (num2 >= num1 && num2 >= num3){
            System.out.println(num2);
        }
        else {
            System.out.println(num3);
        }
        
        
    }
}

/*

Logical operators
AND, OR, NOT --

Their output is always a boolean --> True/False

AND operator -- && 
if the shop is Open, 
AND 
if they are making Samosa, 

Bring Samosa

C1.     C2.    Result
False   True      False
False   False     False
True    False     False
True.   True.     True




OR operator --  ||
// if anyone is true, then give result
C1.  C2.  Result
True  True.  True
True.  False. True
False.  True.  true
False   False.  False


NOT  --- !

C.    Result
True. False
False. true



*/