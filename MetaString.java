import java.io.*;
import java.util.*;
class MetaString 
{

	   public static boolean Equal(String str1, String str2)
	   {
          
	      if(str1.equals(str2)) 
			 return true;
            int count = 0;
            int sum1 = 0;
            int sum2 = 0;
            for(int i = 0; i<str1.length(); i++)
			{
                sum1 = sum1 + str1.charAt(i);
                sum2 = sum2 + str2.charAt(i);
           }
        if(sum1 == sum2)
	{
            if( str1.length() == 2|| str1.length() == 4  &&str1.charAt(0) != str2.charAt(str2.length()-1))
            {
                return false;
            }
             for(int i = 0; i<str1.length(); i++){
           if(str1.charAt(i)!= str2.charAt(i))
		   {
               count++;
           }
        }
        
        if(count == 2)
		{
            return true;
        }
    }
    else
	{
        return false;
    }
        return false;
    }
 public static void main(String[] args)
    {   
        Scanner k=new Scanner(System.in);
		System.out.println("enter the string : ");
		String str1=k.nextLine();
	    System.out.println("enter the second string : ");
	   String str2=k.nextLine();
	  
	   
 if (Equal(str1, str2))
	 {
            System.out.println("Yes");
        }
        else 
		{
            System.out.println("No");
	   }
	   }
}