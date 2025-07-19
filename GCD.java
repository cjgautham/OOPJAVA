package module1;
/*Author:Gautham C J
*Date :19/07/2025
*/
import java.util.Scanner;
public class GCDWhileLoop {
 public static void main(String[] args) {
 	Scanner input = new Scanner(System.in);
 System.out.print("Enter first number: ");
 int a = input.nextInt();
 System.out.print("Enter second number: ");
 int b = input.nextInt();
 int num1 = a;
 int num2 = b;
 while (a != b) {
 if (a > b) {
 a = a - b;
 } else {
 b = b - a;
 }
 }
 System.out.println("GCD of " + num1 + " and " + num2 + " is: " + a);
 }
}