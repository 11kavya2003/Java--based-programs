import java.io.*;
import java.util.*;
import java.io.*;
import java.util.Arrays;
class pair
{
public static void main(String args[])
{ 
Scanner obj=new Scanner(System.in);
System.out.println("enter the no of elements : " );
 int a=obj.nextInt();
 int i,j;
int arr1[]=new int[a];
System.out.println("enter the first array : " );
for(i=0;i<a;i++)
arr1[i]=obj.nextInt();
int arr2[]=new int[a];
System.out.println("enter the second array : " );
for(j=0;j<a;j++)
arr2[j]=obj.nextInt();
System.out.println("enter the n value : " );
int n=obj.nextInt();
{
	for(i=0;i<a;i++)
	for(j=0;j<a;j++)


if(arr1[i]+arr2[j]==n)
System.out.println(arr1[i] + " " + arr2[j]);
}}}