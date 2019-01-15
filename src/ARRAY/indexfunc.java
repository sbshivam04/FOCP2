import java.util.*;
public class indexfunc
{
  static void index_value(int a[], int number)
  { 
    int len=10, i;
    for (i = 0; i < len; i++) 
    {
      if (a[i] == number)
      System.out.println("Index value is "+ i);
    }
    if (i > len) 
    {
      System.out.println("No index value");
    }
    
  }

  public static void main(String args[]) 
  {
    int[] arr = new int[10];
    int len = 10, k;
    Scanner elements = new Scanner(System.in);
    System.out.println("enter elements");
    for (k = 0; k < len; k++) 
    {
      arr[k] = elements.nextInt();
    }
    if (arr == null) 
    {
      System.out.println("empty array");
    }

    System.out.println("enter number to find its index value");
    Scanner num = new Scanner(System.in);
    int value = num.nextInt();
    index_value(arr,value);
  }
}