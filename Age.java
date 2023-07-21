import java.io.*;
import java.util.Scanner;
public class ternary
{
public static void main(String args[])
{
int age;
Scanner sc= new Scanner(System.in);
System.out.println("enter the age: ");
age=sc.nextInt();

int p= age>18?1:0;

if(p==1)
{
System.out.println("Eligible");
}
else
{
System.out.println("Not Eligible");


}


}

}
