package PrecourseGama_Practise_Oct_18;

public class operators {
 public static void main(String args[]) {
	 
	 int num1 = 100;
	 int num2 = 200;
	 int num3 = 300;
	 
	 if(num1 > num2 && num1 > num3) {
		 System.out.println(num1);
	 }else if (num2> num1 && num2>num3) {
		 System.out.println(num2); 
	 }else {
		 System.out.println(num3);
	 }
	 
	 
	 
	 if(num1>0 || num1<0) {
		 System.out.println("not zero");
	 }else {
		 System.out.println("zero");
	 }
	 
	 
	 System.out.println(!true); // false
	 
 }
}
/*

logical operators


if the shop is open AND they are making jalebis, bring jalebi
AND  --  &&
condition 1    condition 2    result 
     T             T   			T
     F				T			F
     T 				F			F
     F				F			F
     
     
     
     
     OR operator -- ||
     bring me pepsi OR coca cola
     condition 1    condition 2    result 
         T              T 				T
         T  			F				T
         F				T				T
         F				F				F
     
     
     
     NOT -- !
     true -- false
     false -- true
     

*/