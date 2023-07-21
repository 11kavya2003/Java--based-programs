import java.util.*;
class Pinpass
{
public static void main(String args[])
{
 int crtpin=123;
int count=1;
Scanner k=new Scanner(System.in);
System.out.println("enter the password : ");
int userpin= k.nextInt();
while(count<=3)
if(crtpin==userpin)
{
System.out.println("Correct, Welcome back");
break;
}
else 
{
if(count==3)
{
System.out.println("Sorry,that you have been locked out");

}

else
{
System.out.println("Invalid,Try again");
break;

}


}count++;

}

}