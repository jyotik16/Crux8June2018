package DynamicProgramming;

import java.util.Scanner;

public class EditDistance {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
//		String s1 = "abcd";
//		String s2 = "agfcd";
//		System.out.println(EditDistanceRec(s1,s2));
//		System.out.println(EditDistanceTD(s1, s2,new int[s1.length()+1][s2.length()+1]));
		String s1 = scn.next();
		String s2 = scn.next();
		System.out.println(EditDistanceBU(s1, s2,new int[s1.length()+1][s2.length()+1]));

	}

	public static int EditDistanceRec(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0) {
			return Math.max(s1.length(), s2.length());
		}
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int ans = 0;
		if (ch1 == ch2) {
			ans = EditDistanceRec(ros1, ros2) + 1;
		} else {
			int i=EditDistanceRec(ros1,s2);
			int d=EditDistanceRec(s1,ros2);
			int r=EditDistanceRec(ros1,ros2);
			ans=Math.min(i, Math.min(d, r));
		}
		return ans;
	}
	public static int EditDistanceTD(String s1, String s2,int[][] strg) {
		if (s1.length() == 0 || s2.length() == 0) {
			return Math.max(s1.length(), s2.length());
		}
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int ans = 0;
		if (ch1 == ch2) {
			strg[s1.length()][s2.length()]=EditDistanceTD(ros1, ros2,strg) + 1;
		} 
		else {
			int i=EditDistanceTD(ros1,s2,strg);
			int d=EditDistanceTD(s1,ros2,strg);
			int r=EditDistanceTD(ros1,ros2,strg);
			strg[s1.length()][s2.length()]=Math.min(i, Math.min(d, r));
		}
		return strg[s1.length()][s2.length()];
	}

	public static int EditDistanceBU(String s1, String s2,int[][] strg) {
		
		//initialize
		for(int i=s1.length();i>=0;i--) {
			for(int j=s2.length();j>=0;j--) {
				if(j==s2.length()) {
					strg[i][j]=s1.length()-i;
				}
				if(i==s1.length()) {
					strg[i][j]=s2.length()-j;
				}
			}
			
		}
		for (int i = s1.length()-1; i >= 0; i--) {
			for (int j = s2.length()-1; j >= 0; j--) {
				
				if (s1.charAt(i)== s2.charAt(j)) {
						strg[i][j]=strg[i+1][j+1];
					} 
				else {
					int ins=strg[i+1][j];
					int d=strg[i][j+1];
					int r=strg[i+1][j+1];
					strg[i][j]=Math.min(ins, Math.min(d, r))+1;
				}
					
			}

		}
		return strg[0][0];
	}
}
