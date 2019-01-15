import java.util.*;

class Merge
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int a,b=0,c=0;
		int arr1[]= new int[5];
		int arr2[]= new int[5];
		int merge[]=new int[10];
		System.out.println("Enter 5 integer nos.");
		for(a=0;a<5;a++)
		{
			arr1[a]= scan.nextInt();
		}
		System.out.println("Enter 5 integer nos.");
		for(a=0;a<5;a++)
		{
			arr2[a]= scan.nextInt();
		}
		a=0;
		for(a=0;a<5;)
		{
			for(;b<5;)
			{
				if(arr1[a]<=arr2[b])
				{
					merge[c]=arr1[a];
					c++;
					a++;
					break;
				}
				else
				{
					merge[c]=arr2[b];
					b++;
					c++;
					break;
				}
			}
		}
		if(a<5)
		{
			for(;a<5;a++)
			{
				merge[c]=arr1[a];
				c++;
			}
		}
		else if(b<5)
		{
			for(;b<5;b++)
			{
				merge[c]=arr2[b];
				c++;
			}
		}
		for(a=0;a<10;a++)
		{
			System.out.println(merge[a]);
		}
	}
}