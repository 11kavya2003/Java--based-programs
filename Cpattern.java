import java.util.*;
class Cpattern
{

public static void main(String args[])
{

int n,i,j,k,l;
Scanner sc=new Scanner(System.in);
System.out.println("size :");

n=sc.nextInt(); 
for(i=1;i<=n;i++)
{

if(i==1||i==n)
{
for(j=1;j<=4;j++)
{
System.out.print(" ");

}

for(j=1;j<=4;j++)
{
System.out.print("#");

}

}

else if(i==2||i==3||i==n-1||i==n-2)
{
if(i%2==0)
{
k=2;
l=2;
}

else
{
k=1;
l=3;
}

for(j=1;j<=k;j++)
{
System.out.print(" ");
}

System.out.print("**");

for(j=1;j<=l;j++)
{
System.out.print("  ");
}

System.out.print("**");


}

else
{

System.out.print("##");

}

System.out.println(" ");
}


}
}