//13. Accept a character from the user and display its ASCII value. 

import java.util.Scanner;
public class ASCIIValue{
  public static void main(String[] args){

   char ch;
   Scanner sc = new Scanner(System.in);

   System.out.println("Enter Any Character:");
   ch=sc.next().charAt(0);

   System.out.println("ASCII Value IS:" + (int)ch);
   }
}