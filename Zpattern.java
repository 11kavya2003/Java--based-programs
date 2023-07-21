import java.util.*;

class Zpattern
{
public static void main(String args[])
{
int i,j;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(i=1;i<=n;i++)
{
if(i==1||i==n)
{
for(j=1;j<=n;j++)
{
System.out.print("@ ");
}
else if((j==n || j==n+1)&&(i==n-3))
{System.out.println(" #");
}
else if((j==n-1 || j==n-2)&&(i==n-2))
{
System.out.println("#");}
{
else if((j==n-3 || j==n-4)&&(i==n-1))
{
System.out.print("  # ");
}else
{
System.out.println(" ");
}

}
}
}
}