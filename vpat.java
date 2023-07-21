import java.io.*;
import java.util.*;
class vpat
{
public static void main(String args[])
{
int n=7;
int m=16;
for(int i=0;i<n;i++)
{
   int number=1;
for(int j=0;j<m;j++)
{
if(i==j)
{
System.out.print(number);
}
else if(i+j==12)
{
    System.out.print(number);
}
else if(i==1 && j==13){
    System.out.print(number);
}
else if(i==2 && j==14){
    System.out.print(number);
}
else if (i==3 && j==15){
    System.out.print(number);
}
else 
{
    System.out.print(" ");
}
number++;
}
System.out.println();
}}}