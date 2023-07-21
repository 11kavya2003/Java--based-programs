import java.util.*;
class RotateElements {    
 public static void main(String[] args) {    
     
        int [] arr = new int [] {2,5,6,8,9,10};     
        int n=3;
        

        System.out.println(" array: ");    
        for (int i = 0; i < arr.length; i++) 
{     
            System.out.print(arr[i] + " ");   
        }     
 System.out.println("The array is rotated at  0  times "); 

         
        for(int i = 0; i < n; i++)
{    
            int j, last;       
            last = arr[arr.length-1];    
            
            for(j = arr.length-1; j > 0; j--){    
                
                arr[j] = arr[j-1];    
            }    
            arr[0] = last;    
        }    
        
        System.out.println(" ");    
        System.out.println("Array after right rotation: ");    
        for(int i = 0; i< arr.length; i++){    
            System.out.print(arr[i] + " ");    
        }              
 System.out.println("The array is rotated at 3 times");    
 
    }    
}