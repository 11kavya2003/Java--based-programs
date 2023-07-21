
import java.io.*;
 public class Uppertriangle
{
public static void main(String args[ ])
{
int a[][]={{1,2,3},{8,6,4},{4,5,6}};

System.out.println("upper triangular matrix: ");
for(int i=0;i<a.length;i++)
{
for(int j=0;i<a[0].length;j++)
{
if(i>j)
System.out.print("0 ");

else
System.out.print(a[i][j] + "  ");

System.out.println();
}}}}