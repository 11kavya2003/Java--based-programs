package placements;
import java.util.*;
 class Targetsum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the target to be achieved : ");
		int target=sc.nextInt();
		System.out.println("Enter the no of inputs : ");
        int n=sc.nextInt();
		System.out.println("Enter the array elements : ");
		
        int arr[]=new int[n];
        int flag=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		if(arr[i]+arr[j]==target) {
        			flag=1;
        		}
        	}
        }
        if(flag==1) {
        	System.out.print("True");
        }
        else {
        	System.out.print("False");
        }

	}

}