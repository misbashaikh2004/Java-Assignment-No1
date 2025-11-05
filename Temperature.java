//3. Accept temperatures in Fahrenheit(F) and print it in Celsius(C) and Kelvin (K).(Hint: C=5/9(F- 32), K = C + 273.15) 

import java.util.Scanner;
public class Temperature{
  public static void main(String[] args){

   double c,k,f;
   Scanner sc = new Scanner(System.in);

   System.out.println("Enter Temperatures in Fahrenheit:");
   f = sc.nextDouble();

   c=5.0/9*(f-32);
   k=c+273.15;

   System.out.println("Celsius is:"+c);
   System.out.println("Kelvin is:"+k);

  }
}
 