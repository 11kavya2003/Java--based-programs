import java.util.Scanner;
 
public class Numseries
{
    public static void main(String[ ] args)
    {
        Scanner m = new Scanner(System.in);
    int num;  
double sum = 0;
 
        System.out.print("Enter number of terms of series : ");
        num = m.nextInt();
 
        for(int i = 1; i <= num; i++)
    {
            sum += 1.0/i;
    }
 
        System.out.println("sum: " + sum);
}
}