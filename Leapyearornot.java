import java.io.*;
import java.util.Scanner;
public class Leapyearornot

public static void main(String args[])
{
 int year;
 Scanner k= new Scanner(System.in)
 System.out.println("enter a year : ");
 year=k.nextInt;
 if(year%4==0)
{
if(year%100==0)
{
if(year%400==0)
System.out.println(year+ "is leap");
}
}
else
System.out.printin(year+ "is non-leap");
}
}