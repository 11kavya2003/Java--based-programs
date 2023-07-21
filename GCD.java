import java.util.Scanner;
class GCD {
    public static void main(String[] args) 
	{ 
	Scanner k=new Scanner(System.in);
	System.out.print("enter a first num: ");
        int num1 =k.nextInt();
		Scanner l=new Scanner(System.in);
	System.out.print("enter a sec num: ");
        int num2 = l.nextInt();

        int gcd = findGCD(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    public static int findGCD(int no1, int no2) {
        if (no2 == 0) 
		{
            return no1;
        } else

			{
            return findGCD(no2, no1 % no2);
        }
    }
}
