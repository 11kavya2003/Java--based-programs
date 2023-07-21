import java.io.*;
import java.util.*;
class aa

{
void spy(int num)
{
int sum=0,prod=1,lastdigit;
lastdigit=num%10;
sum=sum+lastdigit;
prod=prod+lastdigit;
num=num/10;
}}

class bb extends aa

{
void check( int sum, int prod)
{
if(sum==prod)
{
System.out.println("num is spy");
}
else
{
System.out.println("num is not spy");
}
}}

class spynum

{
	public static void main(String args[])
	{
		Scanner k =new Scanner(System.in);
		System.out.println("enter a num: ");
		int num=k.nextInt();
		bb b = new bb();
		b.spy(num);
		b.check(sum,prod);
	}
}