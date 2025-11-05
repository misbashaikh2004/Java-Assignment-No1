//8. The basic salary of an employee is decided at the time of employment, which may be different for different employees. Apart from basic, //employee gets 10% of basic as house rent, 30% of basic as dearness allowance. A professional tax of 5% of basic is deducted from salary. Accept //the employee id and basic salary for an employee and output the take home salary of the employee

import java.util.Scanner;
  public class Employee{
    public static void main(String[]  args){

     double basic,hra,da,pf,gross,net;
     Scanner sc = new Scanner (System.in);

     System.out.println("Enter Basic Salary");
     basic=sc.nextDouble();

     hra = 0.10 * basic;
     da = 0.30 * basic;
     pf = 0.05 *basic;
    
     gross = basic + hra + da;
     net = gross - pf;

     System.out.println("Gross Salary="+gross);
     System.out.println("Net Salary="+ net);
    }
}

   