import java.io.*;
import java.util.*;
public class fuel
{
public static void main (String...args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
int arr1[]=new int[n];
int x=0;
int count=0,count1=0;
int min=0;int ans=0;
for(int i=0;i<n;i++)
{
	arr[i]=s.nextInt();
}
for(int i=1;i<=n;i++)
{
for( int j=0;j<n;j++)
{
   
   if(arr[j]>=i)
   {
      ans=arr[j]-i;
	  count=count+ans;
	  
	  }
	  else
	  {
	  ans=i-arr[j];
	  count1=count1+ans;
	  }
	  
	  }
	  int s1=count+count1;
	  
	  arr1[x++]=s1;
	  count=0; count1=0;
}
Arrays.sort(arr1);
System.out.println(arr1[0]);
System.out.println("pos: " +arr[2]);


}
}