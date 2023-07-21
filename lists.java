import java.io.*;
import java.util.ArrayList;


public class lists {
	public static void main(String[] args){
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		ArrayList<Integer> b = new ArrayList<>();
		b.add(40);
		b.add(30);
	
		a.addAll(b);
	
		System.out.println(a);
		
	}
}