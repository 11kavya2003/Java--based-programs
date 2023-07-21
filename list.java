import java.io.*;
import java.util.ArrayList;


public class lists {
	public static void main(String[] args){
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		
		System.out.println(a);
		ArrayList<Integer> b = new ArrayList<>(Arrays.asList(50,60));
		System.out.println(b);
		a.addAll(b);
		System.out.println("After Joining:");
		System.out.println(b);
		
	}
}