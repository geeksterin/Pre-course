// "static void main" must be defined in a public class.
public class Equality {
    public static void main(String[] args) {
        // WAP to check if 13*2349 is equal to 17*1172
        
        int num1 = 13*2349;
        int num2 = 17*1172;
        
      /*  if (num1 == num2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        */
        
        boolean res = num1 == num2;
        System.out.println(res);
    }
}