import java.io.*;
import java.util.*;
import java.util.Arrays;
class polthief
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String n=s.nextLine();

char a[]=n.toCharArray();
int s1=a.length;
int count=0;
int i,j;
for(i=0;i<s1;i++)
{
for(j=i+1;i<s1;i++)
{
if(a[i]==a[j])
{
count++;
}}}

System.out.println(count);
}}