//4. Accept initial velocity (u), acceleration (a) and time (t). Print the final velocity (v) and the distance (s) travelled. (Hint: v = u + at, s = u + at2) 

import java.util.Scanner;
public class FinalVelocity{
   public static void main(String[] args){

   double v,u,s,a,t;
   Scanner sc=new Scanner(System.in);

   System.out.println("Enter Initial Velocity:");
   u=sc.nextDouble();

   System.out.println("Enter cceleration:");
   a=sc.nextDouble();

   System.out.println("Enter Time:");
   t=sc.nextDouble();
 
   v = u + a * t;
   s = a * t * 2;

   System.out.println("Final velocity is:"+ v);
   System.out.println("Distance is:"+ s);
  }
}