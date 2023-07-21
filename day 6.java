1.....DOWNWARD TRIANGLE PATTERN 


public class DownwardTrianglePattern  
{  
public static void main(String[] args)  
{  
int rows=5;       
for (int i= rows-1; i>=0 ; i--)  
{  
for (int j=0; j<=i; j++)  
{  
System.out.print("*" + " ");  
}  
System.out.println();  
}  
}  
}  

2.....NUMBER PRINTING

public class Pattern
{
    public void displayPattern() 
{
        int a = 1;
        for (int i = 1; i <= 5; i++) 
{
            for (int j = 1; j <= i; j++)
 {
                System.out.print(a++ );
            }
            System.out.println();
        }
    }
}


3....PYRAMID REVERSE

 
public class Pyramidrev {
 
 public static void main(String[] args) {
 
 for(int i=5; i>0 ;i--){
 
 for(int j=0; j < i; j++){
 System.out.print(j+1);
 }
 
 System.out.println("");
 }
 
 }
}

4......CHARACTER PYRAMID
import java.util.*;
 
class Charpyramid
{
 public static void main(String args[])
 {
 int i,j;
 int n=5;
 
     for(i=1;i<=n;i++)
     {
         for(j=1;j<=i;j++)
         {
             System.out.print((char)(i+64));
         }
 
         System.out.println("");
     }
 }
}