import java.io.*;
import java.util.Arrays;
import java.util.*;


class ksmall
{
public static void main(String args[])
{ 
Scanner obj=new Scanner(System.in);
System.out.println("enter the no of elements : ");
int a = obj.nextInt();
int i;
int arr[]=new int[a];
System.out.println("enter the array elements : ");
for(i=0;i<a;i++)
  arr[i]=obj.nextInt();
    System.out.println("enter the k value : ");
	int k=obj.nextInt();
	Arrays.sort(arr);
	int res=arr[k-1];
    System.out.println(res);




}
}
 






/*int[] arr={7,10,4,3,20,15};
int k=3;
Arrays.sort(arr);
int res=arr[k-1];
System.out.println(res);
}}*/
 