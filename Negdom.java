import java.util.Scanner;
import java.util.Arrays;

public class Negdom
 {

  public static void main(String[] args)
 {
    int[] nums = {1,2, 5,-4,3,6};
    System.out.println("Original array of numbers:"+ Arrays.toString(nums));
    boolean result = test(nums);
    System.out.println("Check Negative Dominance in the given array : "  + result);
  }
  public static boolean test(int[] nums) {
    long count_negative, count_positive;
    nums = Arrays.stream(nums).distinct().toArray();
    count_negative = Arrays.stream(nums).filter(s -> s < 0).count();
    count_positive = Arrays.stream(nums).filter(s -> s > 0).count();
    return count_negative > count_positive;
  }
}
