













import java.util.ArrayList;
import java.util.Scanner;

public class nytsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> a_list = new ArrayList<>();
        int size = in.nextInt();
        for (int i = 0; i < size; i++) {
            a_list.add(in.nextInt());
        }
        int q[] = new int[2];
        for (int i = 0; i < q.length; i++) {
            q[i] = in.nextInt();
        }
        a_list.add(q[0],q[1]);
        System.out.println(a_list);

    }
}