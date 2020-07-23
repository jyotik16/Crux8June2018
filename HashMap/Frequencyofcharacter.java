package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Frequencyofcharacter {
	
	public static void main(String[] args) {
		HashMap <String,Integer> map =new HashMap<>();
		String str ="aabcdccd";
		maxfrequency(str);
		//int[] ar= {10,40,20,30,10};
		//int[] br= {50,40,20,30,20,10};
		//Intersection(ar,br);
		int[] ar= {2,12,9,10,16,3,20,25,11,1,8,6,21,22,24};
		//LongestSequence(ar);
		//longestseq(ar);
	}
	
	
	public static void maxfrequency(String str) {
		HashMap <Character,Integer> map =new HashMap<>();
		int max=0; char ch1='\n';
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(!map.containsKey(ch)) {
			   map.put(ch,1);
		}else
		{	
			int temp=map.get(ch);   
			map.put(ch,temp+1);
			if(max<temp+1) {
				max=temp+1;
				ch1=ch;
			}
		}
	}
		//another way to traverse
//		Set<Map.Entry<Character,Integer>> entries = map.entrySet();	
//		for(Map.Entry<Character,Integer> entry:entries) {
//			if(entry.getValue()>max) {
//				max = entry.getValue();
//				maxchar = entry.getKey();
//			}
//		}
		System.out.println(map);
		System.out.println(max);
		System.out.println(ch1);

}
 //Intersection
	public static void Intersection(int[] ar,int[] br) {
		HashMap <Integer,Integer> map =new HashMap<>();
		ArrayList <Integer> ans = new ArrayList<>();
		for(int i=0;i<ar.length;i++) {
			int a=ar[i];
			if(!map.containsKey(a)) {
				map.put(a, 1);
			}else {
				int temp=map.get(a);
				map.put(a,temp+1);
			}
		}
		for(int j=0;j<br.length;j++) {
			int b=br[j];
			if(map.containsKey(b) && map.get(b)>0) {
				ans.add(b);
				int temp=map.get(b);
				map.put(b,temp-1);
			}
		}
		System.out.println(ans);
		 
	}
	//Longest sequences
	public static void LongestSequence(int[] ar) {
		HashMap <Integer,Boolean> map =new HashMap<>();
		ArrayList <Integer> ans1 = new ArrayList<>();
		ArrayList <Integer> ans2 = new ArrayList<>();
		int max=0,len1=0,len2=0;
		boolean flag=true;
		for (int i = 0; i < ar.length; i++) {
			int a = ar[i];
			if (!map.containsKey(a)) {
				map.put(a, true);
			}
			if (max < ar[i])
				max = ar[i];
		}
		//System.out.println(map);
		for (int j = 1; j <= max; j++) {

			if (map.containsKey(j) && flag==true) {
				ans1.add(j);
				len1++;
			} 
			else if(map.containsKey(j) && flag==false) {
				ans2.add(j);
				len2++;
			}
			else {
				
				if(len1<len2) {
					flag=true;
					ans1=new ArrayList<>();
					len1=0;
				}else {
					flag=false;
					ans2=new ArrayList<>();
					len2=0;
				}
		}
	}
		if(len1>len2)
			System.out.println(ans1);
		else
			System.out.println(ans2);
			
	
	}
	
	public static void longestseq(int [] ar) {
		HashMap <Integer,Boolean> map =new HashMap<>();
		ArrayList <Integer> ans = new ArrayList<>();
		int maxlen=0,Seqstarting=0;

		for (int i = 0 ; i < ar.length; i++) {
			if (map.containsKey(ar[i] - 1)) {

				map.put(ar[i], false);
			} else {
				map.put(ar[i], true);
			}
			if (map.containsKey(ar[i] + 1)) {
				map.put(ar[i] + 1, false);
			}
		}
		for (Integer key : map.keySet()) {
			if (map.get(key) == true) {
				int c = 0;
				while (map.containsKey(key + c)) {
					c++;
				}
				if (c > maxlen) {
					maxlen = c;
					Seqstarting = key;
				}
			}
		}
		for (int i = 0; i < maxlen; i++) {

			ans.add(Seqstarting + i);

		}
		System.out.println(ans);

	}
	
}
/*
{1=true, 2=true, 3=true, 6=true, 8=true, 9=true, 10=true, 11=true, 12=true, 16=true, 20=true, 21=true, 22=true, 24=true, 25=true}
[8, 9, 10, 11, 12]
*/