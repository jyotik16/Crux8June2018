package contest2;

import java.util.Scanner;

public class Twins {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		//String str=scn.nextLine();
		//counttwins(str);
		boolean check[] = new boolean[256];
		//System.out.println(counttwinsREC("axaax", check));
		counttwinsREC1("axaxa",0);
	}

	public static void counttwins(String str) {
		int total=0;
	    boolean check[] = new boolean[256];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int c=-1;
			if(check[ch]==true) {
				continue;
			}
			for(int j=0;j<str.length();j++) {
				if(ch==str.charAt(j)) { 
					c++;
				}
				
			}
			check[ch]=true;
			total+=c;
		}
		System.out.println(total);
	}
	public static int counttwinsREC(String str,boolean[] check) {
		
	    
	    if(str.length()==0)
	    	return 0;
		char ch=str.charAt(0);
		String ros=str.substring(1);
		int c=0;
			
			for(int i=0;i<ros.length();i++) {
				
				if(check[ch]==true)
					continue;
				else{
					if(ros.charAt(i)==ch)
					c++;
					}
			}
			check[ch]=true;
		
		int count=c+counttwinsREC(ros,check);
		return count;
		
	}
public static void counttwinsREC1(String str,int count) {
		
	if(str.length()<3) {
		System.out.println(count);
		return;
	}
	   
		char c1=str.charAt(0);
	    char c2=str.charAt(2);
	    String ros=str.substring(1);
	    if(c1==c2) {
	    	
	    	counttwinsREC1(ros,count+1);
	    }
	    else {
	    	counttwinsREC1(ros,count);
	    }
	}
	
}
