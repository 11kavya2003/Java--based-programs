import java.util.*;
class camelcase
{
public static void  main(String args[])
{
  String s = "i am a student";
  int i=0;
  int count=0;
  int n=s.length();
  char c[]=s.toCharArray();
  int res=0;

  for( i=0;i<n;i++)
  {
	  if(i==0)
	  {
		  c[i]=Character.toUpperCase(c[i]);
	  }
	  if (c[i]==' ')
	  {
	  
	  c[i+1]=Character.toUpperCase(c[i+1]);
	  
	  }
  }
 
 System.out.print(c);
 }
}
  
  