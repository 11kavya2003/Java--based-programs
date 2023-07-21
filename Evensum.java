import java.io.*;
class Evensum
{
public static void main(String args[])
{
 int i,sum=0;
 int num=100;
 for(i=2;i<=num;i=i+2)
{
 sum=sum+i;
}
System.out.println("evensum is : " +sum);
}
}