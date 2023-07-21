import java.util.*;
class Intersection
{
public static void main(String args[ ])
{  
int[] arr1=new int[]{1,2,3,4};
int[] arr2=new int[]{1,2,9,7};

   for(int i=0; i<arr1.length; i++ )
 {
       for(int j=0; j<arr2.length; j++) 
{
           
           if(arr1[i]==arr2[j])
 {
              System.out.println(arr2[j]);
            }
        }
    }

}

}