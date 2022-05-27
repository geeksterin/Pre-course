public class Strings {
    public static void main(String[] args) {
        
        String message = "Hello, everyone !! My name 1232334 @#$%$%%";
        
        System.out.println(message);
        
        // 20 + 30 --> 50
        // "Vikas" + "Ranjan" --> "VikasRanjan"
        //  "20" + "30"  -->  "2030"
        // "VIkas " + 27    -->   "VIkas27"
        
        /// string concatenation. -> joining two strings
        
        String firstName = "Vikas";
        String lastName = "Ranjan";
        
        String newName = firstName + lastName;
        System.out.println(newName);
        
        System.out.println(firstName + "   " + lastName);
        
        System.out.println("Hello, my name is " + "Vikas");
        
        System.out.println("Hello, my dateofbirth is " + 27 + " May ");
        
       System.out.println(" The addition of 500 and 300 is : "+ 500 + 300);
        
      System.out.println(" The addition of 500 and 300 is : "+ (500 + 300));
    }
}