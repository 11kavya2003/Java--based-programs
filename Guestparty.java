import java.util.*;
class Guestparty
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
System.out.print("Enter the limited time : "  );
        int t= sc.nextInt ();
        int E[] = new int[t];
        int L[] = new int[t];
System.out.println("entry input :" );
        for (int i = 0; i < t; i++)
            E[i] = sc.nextInt ();
System.out.println("entry output: " );

        for (int i = 0; i < t; i++)
            L[i] = sc.nextInt ();

        int max = 0, sum = 0;
        for (int i = 0; i < t; i++)
        {
	        sum += E[i] - L[i];
	        max = Math.max (sum, max);
        }
        System.out.println (max);
    }
}