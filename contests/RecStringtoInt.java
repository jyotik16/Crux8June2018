package contest1;

import java.util.Scanner;

public class RecStringtoInt {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		String n = scn.nextLine();
		//System.out.println(Integer.parseInt(n));
		System.out.println(Returnnum(n, n.length()-1));
		

}
	public static int Returnnum(String str, int vidx) {
		if(vidx==0)
			return (int)(str.charAt(0));
		int res = Returnnum(str , vidx-1);
		int num = res*10 + (int)(str.charAt(vidx));
		
		return num ;
	}

}
