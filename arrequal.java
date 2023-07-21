import java.io.*;
import java.util.*;
class arrequal
{
public static int equal(int arr[],int arr1[])
{
  if(arr==arr1)
  {
    return 1;
  }	
  else
  {
   return 0;
   }
}

public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	int arr1[]=new int[n];
	if(arr.length==arr1.length)
	{
	for(int i=0;i<n;i++)
	{
	   arr[i]=s.nextInt();
	   arr[i]=s.nextInt();
	 }
	 System.out.println(equal(arr,arr1));
    }
}
}