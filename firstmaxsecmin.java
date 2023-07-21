import java.io.*;
import java.util.*;
class firstmaxsecmin
{
	public static void main(String args[])
	{ int size,s;
		Scanner k=new Scanner(System.in);
		System.out.println("enter len of array : ");
		 size=k.nextInt();
		   int ar[]=new int[size];
	System.out.println("enter array elements : ");
for(s=0;s<size;s++) 
{
	ar[s]=k.nextInt();
}	int index;
   int n=ar.length;
   int i=ar[0],j=ar[n-1];
   		for ( index = 0; index < n; index++)
			{
				if (index % 2 == 0)
			{
				ar[index] = j;
				j -= 1;
			}
			else 
			{
				ar[index] = i;
				i += 1;
			}
		}
for (i = 0; i < n; i++)
			System.out.print(ar[i] + "  ");
	}
}