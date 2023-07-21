import java.io.*;
class Oddsum
{
public static void main(String args[])
{
 int i,sum=0;
 int num=100;
 for(i=1;i<=num;i=i+2)
{
 sum=sum+i;
}
System.out.println("oddsum is : " +sum);
}
}