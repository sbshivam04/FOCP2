import java.util.*;

public class Pascal_Triangle
{
  public static void main(String args[]) 
  {
    int i, space, j, num=1;
    String ch;
	do
	{
		System.out.println("Enter Number of Rows");
		Scanner row = new Scanner(System.in);
		int rows = row.nextInt();
		for(i=0; i< rows; i++) 
		{
			for(space= rows; space> i; space--)  
			{
				System.out.print(" ");
			}
			num= 1;
			for(j= 0; j<= i; j++)
			{
				System.out.print(num + " ");
            	num= (num* (i- j))/ (j+ 1);
			}
			System.out.println();
		}
		System.out.println("Press Y to continue with another value and N to exit");
		Scanner again = new Scanner(System.in);
		ch = again.next();
	}while(!(ch.equals("N") || ch.equals("n")));
  }
}