import java.util.Scanner;
public class CircleAndCircumference{
   public static void main(String[] args){

   double area,radius,circumference;
   Scanner sc = new Scanner(System.in);

   System.out.println("Enter Radius Of Circle:");
   radius = sc.nextDouble();

   area = 3.14 * radius *radius;
   circumference = 2 * 3.14 * radius;

   System.out.println("Area of circle is:"+area);
   System.out.println("Circumference is:"+circumference);
  }
}