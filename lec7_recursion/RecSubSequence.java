package lec7_recursion;

import java.util.ArrayList;
import java.util.Scanner;
//cointoss
public class RecSubSequence {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// String str = scn.next();
		//int not = scn.nextInt();
		 //System.out.println(printMazePath(0,2,0,2," "));
		//System.out.println(printSS1("ab"," "));
		//System.out.println(printMazePathMMD(0,2,0,2,""));
		//System.out.println(getSSRev("abc"));
		printSS("dcba"," ");
		
	}

	public static ArrayList<String> getSS(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = getSS(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String rrs : rr) {
			mr.add(rrs);
			mr.add(rrs+ch);
		}
		return mr;
	} //[, a, b, ba, c, ca, cb, cba]

	public static ArrayList<String> getSSRev(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(str.length()-1);
		String ros = str.substring(0,str.length()-1);
		ArrayList<String> rr = getSSRev(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String rrs : rr) {
			mr.add(rrs);
			mr.add(rrs+ch);
		}
		return mr;
	}
	public static void printSS(String str,String ans) {
		if (str.length() == 0) {
			StringBuilder sb=new StringBuilder(ans);
			System.out.println(sb.reverse());
			return;
		}
		char ch = str.charAt(0);
		String ros=str.substring(1);
		printSS(ros,ans);
		printSS(ros,ans+ch);
		
	}
	public static int printSS1(String str,String ans) {
		int count;
		if (str.length() == 0) {
			return 1;
		}
		count=0;
		char ch = str.charAt(0);
		String ros=str.substring(1);
		count+=printSS1(ros,ans);
		count+=printSS1(ros,ans+ch);
		count+=printSS1(ros,ans+(int)ch);
		return count;
				
	}

	public static ArrayList<String> getSS1(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = getSS1(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String rrs : rr) {
			mr.add(rrs);
			mr.add((int) ch + rrs);
			mr.add(ch + rrs);
		}
		return mr;
	}
	
	public static ArrayList<String> CoinToss(int toss) {
		if (toss == 1) {
			ArrayList<String> br = new ArrayList<>();
			br.add("H");
			br.add("T");
			return br;
		}
		ArrayList<String> rr = CoinToss(toss - 1);
		ArrayList<String> mr = new ArrayList<>();
		for (String rrs : rr) {

			mr.add(rrs + 'H');
			mr.add(rrs + 'T');

		}
		return mr;
	}
	public static int CoinTossprint(int toss,String ans) {
		if (toss == 0) {
			System.out.println(ans);
			return 1;
		}
		 
		int h=CoinTossprint(toss - 1,ans+"H");
		int t=CoinTossprint(toss - 1,ans+"T");		
		return h+t;
		
	}

	public static ArrayList<String> MazePath(int cr,int er,int cc,int ec){

		if(cr==er && cc==ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
	}
		if(cr>er || cc>ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
	} 
		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rrh=MazePath(cr,er,cc+1,ec);
		for(String rrs:rrh) {
			mr.add("H"+rrs);
		}
		ArrayList<String> rrv=MazePath(cr+1,er,cc,ec);
		for(String rrs:rrv) {
			mr.add("V"+rrs);
		}
		ArrayList<String> rrd=MazePath(cr+1,er,cc+1,ec);
		for(String rrs:rrd) {
			mr.add("D"+rrs);
		}
		return mr;
}
	
	public static int printMazePathD(int cr,int er,int cc,int ec,String ans){

		if(cr==er && cc==ec) {
			System.out.print(ans+" ");
			return 1;
	}
		if(cr>er || cc>ec) {
			
			return 0;
	} 
		int count=0;
		count+=printMazePathD(cr,er,cc+1,ec,ans+"H");
		count+=printMazePathD(cr+1,er,cc,ec,ans+"V");
		count+=printMazePathD(cr+1,er,cc+1,ec,ans+"D");
		return count;		
}
	public static int printMazePathMMD(int cr,int er,int cc,int ec,String ans){

		if(cr==er && cc==ec) {
			System.out.print(ans+" ");
			return 1;
	}
		if(cr>er || cc>ec) {
			
			return 0;
	} 
		int count=0;
		for(int i=1;i<=ec;i++) {
		count+=printMazePathMMD(cr,er,cc+i,ec,ans+"H"+i);
		}
		for(int i=1;i<=er;i++) {
		count+=printMazePathMMD(cr+i,er,cc,ec,ans+"V"+i);
		}
		for(int i=1;i<=er && i<=ec;i++) {
		count+=printMazePathMMD(cr+i,er,cc+i,ec,ans+"D"+i);
		}
		return count;		
}
	
			
		
		

}