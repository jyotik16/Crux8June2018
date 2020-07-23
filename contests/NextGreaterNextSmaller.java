package contest1;
import java.util.Scanner;
public class NextGreaterNextSmaller {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int test = scn.nextInt();
		int a = 1, N;
		while (a <= test) {
			N = scn.nextInt();
			int[] ar = new int[N];

			for (int i = 0; i < N; i++)
				ar[i] = scn.nextInt();
			for (int i = 0; i < N; i++) {

				FindGS(ar, N, i, ar[i]);
				
			}
			a++;
			System.out.println();
		}

	}
	public static void FindGS(int[] ar, int N, int i, int E) {
		int flag = 0, NS = 0, NG = 0;
		for (int j = i + 1; j < N - 1; j++) {
			if (E < ar[j]) {
				NG = ar[j];
				if (NG >= ar[j + 1]) {
					NS = ar[j + 1];
					flag = 1;
					break;
				}
			}

		}
		if (flag == 1)
			System.out.print(NS + " ");
		else
			System.out.print("-1 ");

	}
 
}
