import java.util.*;

 class Lrksum
{ 
public static void main(String args[] )
 { 
  Scanner s = new Scanner(System.in);
System.out.println(" enter the sequence : ");
 int l = s.nextInt(); 
int r = s.nextInt();
 int k = s.nextInt();
 int count = 0; 
if(k==0)
{
	System.out.println("invalid");
}if(k>0)
for(int i=l;i<=r;i++)
{
 if(i%k==0) 
{
count++;
}
else 
{
System.out.println("invalid");
}
 System.out.println( count);
 } 
}
}