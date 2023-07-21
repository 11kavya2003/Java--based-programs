import java.util.*;

class Maxmin
{
public static void main(String args[])
{

int n,i;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();

int a[]=new int[n];


System.out.println("Array elements ");


for(i=0;i<n;i++)
{
  
a[i]=sc.nextInt();  

}

int max=a[0];
int min=a[0];
for(i=0;i<5;i++)
{
if(a[i]>max)
{
max=a[i];
}

if(a[i]<min)
{
min=a[i];
}


}

System.out.println("The max is  "+max);
System.out.println("The min is  "+min);



}
}