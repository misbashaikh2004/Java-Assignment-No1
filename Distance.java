//10. Accept the x and y coordinates of two points and compute the distance between the two points. 

import java.util.Scanner;
public class Distance{
  public static void main(String[] args){

   double x1 ,y1 ,x2 ,y2 ,distance;
   Scanner sc = new Scanner(System.in);

   System.out.println("Enter X1 Coordinate:");
   x1= sc.nextDouble();

   System.out.println("Enter Y1 Coordinate:");
   y1=sc.nextDouble();

   System.out.println("Enter X2 Coordinate:");
   x2= sc.nextDouble();

   System.out.println("Enter Y2 Coordinate:");
   y2=sc.nextDouble();

   distance = Math.sqrt( (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1) );

   System.out.println("Distance is:" + distance);
   }
}