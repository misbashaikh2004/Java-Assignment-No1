//6. Accept three dimensions length (l), breadth(b) and height(h) of a cuboid and print surface area and volume. 
(Hint: surface area=2(lb + lh +bh), volume = lbh) 

import java.util.Scanner;
public class Dimensions{
   public static void main(String[] args){

    double length , breadth , height , area , volume;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Lenght:");
    lenght=sc.nextDouble();
  
    System.out.println("Enter Breadth:");
    breadth=sc.nextDouble();


    System.out.println("Enter Heigth:");
    height=sc.nextDouble();

    area = 2 (length * breadth + length * height + breadth * height);
    volume = length * breadth * height;

     System.out.println("Surface Area is:"+area);
     System.out.println("Volume is:"+volume);
    }
}

