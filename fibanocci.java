package module1;
/*Author:Gautham C J
*Date    :19/07/2025
*/
import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int W = sc.nextInt();
        int i,num1 = 0, num2= 1;
        System.out.println("Fibonacci series up to " + W + ":");
        System.out.print(num1 + "\n");
        System.out.print(num2 + "\n");
        
        i=0;
        while (i <=W-2) 
        {
           int num3 = num1+ num2;
            num1 = num2;
            num2= num3;
            System.out.print(num3 + "\n");

            i++;
        }

    }
}