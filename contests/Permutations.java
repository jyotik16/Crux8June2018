package contest2;

import java.util.Scanner;

public class Permutations {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		 String str = scn.nextLine();
		 //System.out.println(PermutationCount(str,""));
		//printPermutationCount(str,"");
		// permutationLexicoLarger(str,"",false,str);
		 //permutationLexicoSmaller(str,"",false,str);
		 permutationNoDuplicates(str," ");

	}

public static int permutationLexicoLarger(String ques,String ans,boolean isLarger,String ss) {
		if (ques.length() == 0) {
			if(!ss.equals(ans))
			System.out.print(ans + " ");
			else
			return 1;
		}
		int count = 0;
		for (int i = 0; i < ques.length(); i++) {
			String ros = ques.substring(0, i) + ques.substring(i + 1);
			char ch = ques.charAt(i);
			if (isLarger) {
				count += permutationLexicoLarger(ros, ans + ch, true,ss);
			} else {
				if (ch > ques.charAt(0)) {
					count += permutationLexicoLarger(ros, ans + ch, true,ss);
				} else if (ch < ques.charAt(0)) {
					// nocall
				} else {
					count += permutationLexicoLarger(ros, ans + ch, false,ss);

				}

			}
		}
		return count;
	}

public static int permutationLexicoSmaller(String ques,String ans,boolean isLarger,String ss) {
		if (ques.length() == 0) {
			if(!ss.equals(ans))
			System.out.println(ans);
			else
			return 1;
		}
		int count = 0;
		for (int i = 0; i < ques.length(); i++) {
			String ros = ques.substring(0, i) + ques.substring(i + 1);
			char ch = ques.charAt(i);
			if (isLarger) {
				count += permutationLexicoSmaller(ros, ans + ch, true,ss);
			} else {
				if (ch > ques.charAt(0)) {
					// nocall
				} else if (ch < ques.charAt(0)) {
					
					count += permutationLexicoLarger(ros, ans + ch, true,ss);
				} else {
					count += permutationLexicoSmaller(ros, ans + ch, false,ss);

				}

			}
		}
		return count;
	}
	public static int PermutationCount(String str,String ans) {

		if (str.length() == 0) {
			return 1;
		}
		
		int count=0;
			for (int i = 0; i < str.length(); i++) {
				String ros = str.substring(0,i)+str.substring(i+1);
				char ch = str.charAt(i);
				count+=PermutationCount(ros,ans+ch);
			}
			
		return count;
		
	}

	public static int permutationNoDuplicates(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return 1;
		}

		int count = 0;

		boolean[] processed = new boolean[256];

		for (int i = 0; i < ques.length(); i++) {

			char ch = ques.charAt(i);

			if (processed[ch] == true) {
				continue;
			}

			String roq = ques.substring(0, i) + ques.substring(i + 1);
			count += permutationNoDuplicates(roq, ans + ch);
			processed[ch] = true;
		}

		return count;

	}

	public static void printPermutationCount(String str,String ans) {

		if (str.length() == 0) {
			System.out.print(ans+" ");
			return;
		}
		
		int count=0;
			for (int i = 0; i < str.length(); i++) {
				String ros = str.substring(0,i)+str.substring(i+1);
				char ch = str.charAt(i);
				printPermutationCount(ros,ans+ch);
			}
			
		
	}
	
}
