import java.util.*;
 
public class Pyramidrev
 {
 
 public static void main(String[] args)
 {
Scanner m = new Scanner(System.in);
System.out.println("enter the no of rows");

int l=m.nextInt();
 
 for(int i=1; i<=l ;i++)
{
 for(int j=l; j > i; j--)
{
 System.out.print(" ");
 }
for(int k =1;k<=i;k++)
{
System.out.print(k+"  ");
 }
 System.out.println();
 }
 
 }
}