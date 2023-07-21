import java.util.*;
import java.io.*;
class maxproduct
{
public static void main(String args[])
{
int arr[]={1,5,4,5};
int out;
Scanner k=new Scanner(System.in);
System.out.println("enter the i value: ");
int i=k.nextInt();
System.out.println("enter the j value: ");
int j=k.nextInt();
out=(arr[i]-1)*(arr[j]-1);
System.out.println("expected output is " +out);}}
