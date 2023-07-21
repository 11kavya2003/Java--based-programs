
import java.io.*;


class diasquarestar {

	public static void star(int k)
	{
		int i, j;
		for (i = 1; i<= j; i++) 
		{
			for (j = 1; j <= k; j++) 
			{
				
				if (i == 1 || i == k || b == 1 || b == k
					|| i == j || j == (k -i+ 1))
                          System.out.print("*");
				else

					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int rows = 5;
		star(rows);
	}
}
