import java.util.*;

public class index 
{
  public static void main(String args[]) 
  {
    int a;
    int[] arr = new int[10];
    int len = 10;
    Scanner elements = new Scanner(System.in);
    System.out.println("enter elements");
    for (a = 0; a < len; a++) 
    {
      arr[a] = elements.nextInt();
    }
    if (arr == null) 
    {
      System.out.println("empty array");
    }
    System.out.println("enter number to find its index value");
    Scanner num = new Scanner(System.in);
    int value = num.nextInt();
    for (a = 0; a < len; a++) 
    {
      if (arr[a] == value)
      System.out.println("Index value is "+ a);
    }
    if (a > len) 
    {
      System.out.println("No index value");
    }
  }
}