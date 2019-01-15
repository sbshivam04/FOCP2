 import java.util.*;
public class Series_Sum
{
  public static void main(String args[]) 
  {
  	double a, n, power, i= 1, factorial= 1, j= 1;
    double term=0, sum= 1;

  	System.out.println("enter value of a");
    Scanner value = new Scanner(System.in);
  	a = value.nextInt();
    
    System.out.println("enter number of terms");
    Scanner terms = new Scanner(System.in);
    n = terms.nextInt();

    if(n== 1)
    {
      sum= 1;
    }
    else
    {
      while (i < n) 
      {
        while(j<= i)
        {
          factorial*=j;
          j++;
        }
      power= (int)Math.pow(a,i);
      term=power/factorial;
      sum += term;
      i++;
      }
    }  
    System.out.println("sum of series is "+ sum); 	
    }
}