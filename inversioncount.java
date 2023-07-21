import java.io.*;
import java.util.*;
class inversioncount
{
    public static void main (String args[])
	{
	int arr[]={1,9,6,4,5};
	int i,j;
	int count=0;
	for(i=0;i<arr.length-1;i++)
		for(j=i+1;j<arr.length;j++)
			if (arr[i]>arr[j])
			{
				count++;
		    }
System.out.println(count);
}}