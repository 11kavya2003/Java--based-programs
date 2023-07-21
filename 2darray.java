import java.io.*;
class 2darray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in)
System.out.println("ENTER ROW LENGTH : ");
int row=sc.nextInt();
System.out.println("ENTER COLUMN LENGTH : ");
int column=sc.nextInt();
int a[] []=new int[row][column];
System.out.print("Enter" +row*column+ "elements to store in array");
for(int i=0;i<row;i++)
{ 
for(int j=0;j<column;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("Elements in array : ");
for(int i=0;i<row;i++)
{
for(int j=0;j<column;j++)
{
System.out.println(a[i][j]):
}}}}