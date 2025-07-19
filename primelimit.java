package module1;
/*Author:Gautham C J
*Date    :19/07/2025
*/
public class PrimeUpto100
{
    public static void main(String[] args) 
    {
        System.out.println("Prime numbers between 1 and 100 are:");
        for(int i=2;i<=100;i++)
        {
          int prime=0;
          for(int j=2;j<i;j++)
          {
             if(i%j==0)
             {
               prime=1;
               break;
             }     
          }
          if(prime==0)
          {
           System.out.println(""+i);
          }
        }
        
    }
}

