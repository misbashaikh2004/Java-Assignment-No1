//9. A cashier has currency notes of denomination 1, 5 and 10. Accept the amount to be withdrawn from the user and print the total number of //currency notes of each denomination the cashier will have to give.

import java.util.Scanner;
  public class Currency{
     public static void main(String[] args){

      int amt, n1, n5, n10;
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter amount to withdraw:");
      amt=sc.nextInt();

      n10 = amt / 10;
      amt %= 10;
      n5 = amt / 5;
      amt %= 5;
      n1 = amt;

     System.out.println("10 Rs notes:"+n10);
     System.out.println("5 Rs coins:"+n5);
     System.out.println("1 Rs coins:"+n1);
     }
}




