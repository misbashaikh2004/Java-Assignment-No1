//12. Accept a character from the keyboard and display its previous and next character in order. Ex. If the character entered is ‘d’, display “The //previous character is c”, “The next character is e”. 

import java.util.Scanner;
public class NextAndPrevious{
   public static void main(String[] args){

   char ch;
   Scanner sc = new Scanner(System.in);

   System.out.println("Enter Any Character:");
   ch=sc.next().charAt(0);

   System.out.println("Previous Character is:"+ (char)(ch-1));
   System.out.println("Next Character is:"+ (char)(ch+1));
   
   }
}