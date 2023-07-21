import java.util.*;
class Testsum4{
    
    public static void main(String[] args)
 {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-->0){
        String num=sc.next();
        char c=num.charAt(0);
      if(Character.getNumericValue(c)%2==0)
                System.out.println("EVEN");
      else
                System.out.println("ODD");
       }
         

            
      
        }
    }