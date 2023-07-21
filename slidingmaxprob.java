// Java program to find the maximum for each
// and every contiguous subarray of size K


import java.util.*;

class slidingmaxprob{

static void printKMax(int a[], int n, int k)
{
	if (k == 1) {
		for (int i = 0; i < n; i += 1)
			System.out.print(a[i]+ " ");
		return;
	}

	
	int p = 0,
		q = k - 1,
		t = p,
		max = a[k - 1];

	while (q <= n - 1) {

		
		if (a[p] > max)
			max = a[p];

		p += 1;

		if (q == p && p != n) {
			System.out.print(max+ " ");
			q++;
			p = ++t;

			if (q < n)
				max = a[q];
		}
	}
}

public static void main(String[] args)
{
	int a[] = { 1, 2, 3, 1, 4,
				5, 2, 3, 6};
	int n = a.length;
	int K = 3;

	printKMax(a, n, K);
}
}


