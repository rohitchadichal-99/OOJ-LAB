import java.io.*;
import java.util.*;
import java.lang.*;
public class quadratic
{
 private static double a;
 private static double b;
 private static double c;
 public static void read()
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Co-Effcient a");
 a=sc.nextDouble();
 System.out.println("Enter the Co-Effcient b");
 b=sc.nextDouble();
 System.out.println("Enter the Co-Effcient c");
 c=sc.nextDouble();
 System.out.println("THANK YOU FOR ENTERRING THE CO-EFFCIENTS");
 }
 public static void calc()
 {
 read();
 double d=b*b-4*a*c;
 if(d>0)
 {
 System.out.println("ROOTS ARE READ AND DISTINCT");
 System.out.println("FIRST ROOT IS " + (-b+Math.sqrt(d))/(2*a));
 System.out.println("FIRST ROOT IS " + (-b-Math.sqrt(d))/(2*a));
 }
 else if(d==0)
 {
 System.out.println("Roots are equal");
 System.out.println("ROOTS ARE " + (-b)/(2*a));
 }
 else
 {
 System.out.println("ROOTS ARE IMAGINARY");
 System.out.println("ROOTS ARE " + -b/(2*a) + "+" +"i" + (Math.sqrt(-d))/(2*a));
 System.out.println("ROOTS ARE " + -b/(2*a) + "-" +"i" + (Math.sqrt(-d))/(2*a));
 }
 }
 public static void main(String[] args)
 {
 calc();
 }
}