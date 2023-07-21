import java.io.*;
import java.util.*;
class frog
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the no of elements : " );
 int a=obj.nextInt();
 int i,j;
int arr[]=new int[a];
System.out.println("enter the array : " );
for(i=0;i<a;i++)
arr[i]=obj.nextInt();
System.out.println(" array : " );
 for ( i = 0; i < a; i++) 
{     
            System.out.print(arr[i] + " ");   
        }   }} 