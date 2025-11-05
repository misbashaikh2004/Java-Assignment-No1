//7. Accept two integers from the user and interchange them. Display the interchanged numbers. Using temporary variable Without using temporary 
//variable a. Using + and – operator 

import java.util.Scanner;
public class SwappingNumber{
   public static void main(String[] args){

   int a,b;
   Scanner sc = new Scanner(System.in);

   System.out.println("Enter 2 Numbers");
   a=sc.nextInt();
   b=sc.nextInt();

   a = a + b;
   b = a - b;
   a = a - b;
  
   System.out.println("Swapping is:" + a +" " + b);
   }
}