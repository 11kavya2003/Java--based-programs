import java.util.*;
class Find
{
 public static void main(String args[ ])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the num");
int t=s.nextInt(); 
t=-1;
int sum=0;
int min=Integer.MIN_VALUE;
int max=Integer.MAX_VALUE;
for(int i=0;i>-1;i++)
{
int p=s.nextInt();
if(p<min)
 min=p;
if(p>max)
 max=p;
sum+=p;
}
System.out.println(min +" "+max+" "+sum);
}
}