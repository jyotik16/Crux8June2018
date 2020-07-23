package contest1;
import java.util.Scanner;
public class Magicalpark2 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int m = scn.nextInt();
		int k = scn.nextInt();
		int s = scn.nextInt();
		char[][] arr = new char[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.next().charAt(0);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (s > 0) {
				for (int j = 0; j < arr[0].length; j++) {
					if (s > 0) {
						if (j == 0) {
							s = s + 1;
						}
						if (arr[i][j] == '.') {
							s = s - 1;
							if (s < 0) {
								break;
							} else
								s = s - 2;
						} else if (arr[i][j] == '*') {
							s = s - 1;
							if (s < 0)
								break;
							else
								s = s + 5;
						} else if (arr[i][j] == '#') {
							s = s - 1;
							break;
						}
					} else {
						break;
					}
				}
			}
		}
		if (s < k) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
			System.out.println(s);
		}
	}

}
