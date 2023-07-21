import java.util.*;
class Power
{
public static void main(String args[])
{

Scanner sc= new Scanner(System.in);
System.out.print("Enter the number: ");
int n= sc.nextInt();

System.out.print("Enter the power: ");
int p= sc.nextInt();

int i,ans=1;
for(i=1;i<=p;i++)

{

   ans=ans*n;

}
System.out.println("The value of numbers is "+ans);
}

}