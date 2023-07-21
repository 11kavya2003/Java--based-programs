import java .util.*;

class Reversenum
{
public static void main(String args[])
{

Scanner sc= new Scanner(System.in);
System.out.print("Enter the number: ");
int n= sc.nextInt();
int i,r,rev=0 ;
while(n>0)
{
r=n%10;
n=n/10;
rev=rev*10 + r;

}
System.out.println("The reverse  numbers are "+rev);
}

}