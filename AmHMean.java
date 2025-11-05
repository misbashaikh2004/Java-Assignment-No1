//5. Accept two numbers and print arithmetic and harmonic mean of the two numbers. (Hint: AM=(a+b)/2, HM = ab/(a+b)) 

import java.util.Scanner;
public class AmHMean{
  public static void main(String[] args){

   double am , hm , a , b;
   Scanner sc= new Scanner(System.in);
 
   System.out.println("Enter 2 Numbers");
   a=sc.nextDouble();
   b=sc.nextDouble();

   am = (a+b) / 2;
   hm = (a+b)/ (a+b);

   System.out.println("Arithmetic mean is:" + am);
   System.out.println("Arithmetic mean is:" + hm);
   }
}
 
