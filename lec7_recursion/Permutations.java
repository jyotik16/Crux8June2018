package lec7_recursion;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Permutations {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		 //String str = scn.nextLine();
		//ArrayList<String> ss=Permutation("abc");
		//String sd=ss.toString();
		//System.out.println(sd);
		//System.out.println(printPermutationCount("abc"," "));
		//PermutationDuplicate("aab"," ");
		System.out.println(permutationLexicoLarger("cab","",false,"cab"));
		//String newstr=Sortstring(str);
		//PermutationDuplicate(newstr, " ");
	}
	public static String Sortstring(String ss) {
		char ar[] = ss.toCharArray();
		Arrays.sort(ar);
		 return new String(ar);
	}
	public static ArrayList<String> Permutation(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = Permutation(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String rrs : rr) {
			for (int i = 0; i <= rrs.length(); i++) {
				mr.add(rrs.substring(0, i) + ch + rrs.substring(i));
			}
		}
		return mr;
	}
	public static void printPermutation(String str,String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		
			for (int i = 0; i < str.length(); i++) {
				String ros = str.substring(0,i)+str.substring(i+1);
				char ch = str.charAt(i);
				printPermutation(ros,ans+ch);
			}
		
		
	}
	public static void Permute(String str,String ans) {
		for(int i=0;i<str.length()-1;i++) {
			
		}
		
		//System.out.println(str);
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

public static int printPermutationCount(String str,String ans) {

		if (str.length() == 0) {
			System.out.print(ans+" ");
			return 1;
		}
		
		int count=0;
			for (int i = 0; i < str.length(); i++) {
				String ros = str.substring(0,i)+str.substring(i+1);
				char ch = str.charAt(i);
				count+=printPermutationCount(ros,ans+ch);
			}
			
		return count;
		
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

}
