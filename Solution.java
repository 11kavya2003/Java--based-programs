import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        for (int i = 0; i < j; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int x = 1;
            int o = a;
            for (int k = 0; k < n; k++) {
                o = o + x * b;
                System.out.print(o);
                x = x << 1;
                System.out.print(' ');
}
            System.out.println();
        }
    }
}