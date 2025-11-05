//11. Consider a room having one door and two windows both of the same size. Accept dimensions of the room, door and window. Print the area to be //painted (interior walls) and area to be whitewashed (roof). 


import java.util.Scanner;
  public class Home{
     public static void main(String[] args){

     double length,height,breadth,wall_area,roof_area,door,window;
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Length:");
     length=sc.nextDouble();
     
     System.out.println("Enter Breadth:");
     breadth=sc.nextDouble();

     System.out.println("Enter Height:");
     height=sc.nextDouble();

     System.out.println("Enter Door Area:");
     door=sc.nextDouble();

     System.out.println("Enter Window Area:");
     window=sc.nextDouble();
 
     wall_area = 2 * height * (length + breadth) - (door + 2 * window);
     roof_area = length * breadth;

     System.out.println("Wall Area is paint=" + wall_area);
     System.out.println("Roof Area is paint=" + roof_area);
     }
}
