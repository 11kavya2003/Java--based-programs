import java.io.*;
class sockMerchant
{
public static void main(String args[])
{
int n=9;
    int count=0;
    int ar[]={10,20,20,10,10,30,50,10,20};
    for(int i=0; i<n-1; i++)
    {
        if(ar[i]==ar[i+1])
        {
            count++;
            i++;
        }
    }
    System.out.println(count) ;
}}