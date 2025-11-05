//2. Accept dimensions of a cylinder and print the surface area and volume. (Hint: surface area = 2 πr2+ 2πrh, volume = πr2h) 


import java.util.Scanner;
public class Cylinder{
   public static void main(String[] args){

   double area,volume,radius,height;
   Scanner sc = new Scanner(System.in);

   System.out.println("Enter A Radius:");
   radius = sc.nextDouble();

   System.out.println("Enter A Heigth:");
   height = sc.nextDouble();

   area = 2 * 3.14 * radius * radius + 2 * 3.14 * radius * height;
   volume = 3.14 * radius * radius * height;

   System.out.println("Surface Of Area is:" + area);
   System.out.println("Volume is:" + volume);
   }
}