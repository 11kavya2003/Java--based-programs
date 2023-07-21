import java.io.*;
class  Transpose
{
public static void main(String args[])
{
int original[ ][ ]={{1,2},{4,5}};

int transpose[ ][ ]=new int[2][2];
for(int i=0;i<original.length;i++)
{
for(int j=0;j<original[0].length;j++)
{
transpose[i][j]=original[j][i];
}}
System.out.println("before transpose : ");
for(int i=0;i<original.length;i++)
{
for(int j=0;j<original[0].length;j++)
{
System.out.print( original[i][j]+ " ");}
System.out.println();}
System.out.println("after transpose : ");
for(int i=0;i<original.length;i++)
{
for(int j=0;j<original[0].length;j++)
{
System.out.print(transpose[i][j]+ " ");}
System.out.println();}




}}