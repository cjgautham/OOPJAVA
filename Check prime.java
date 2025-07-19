package module1;
/*Author:Gautham C J
*Date    :19/07/2025
*/ 
import java.util.Scanner;
public class CheckPrime
{ 
    public static void main(String[ ] args) 
    {
        Scanner Z = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int W = Z.nextInt();
        int i,flag=0;
        for(i=2;i<=W/2;i++)
        {
        	 if (W%i==0)
        	 {
        	 	flag=1;
        	 	break;
        	 }
       }  
      if (flag==0) {
        
          System.out.println(W + " is a    Prime    number.");
        } 
     else {
            System.out.println(W + " is Not a Prime number.");
        }

        
    }
}