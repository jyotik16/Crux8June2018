package Microsoft;

import Generic.LinkedListGeneric;
// infix , avg sum , bst delete node given in range
public class IDC {
	public static void main(String[] args) {
		System.out.println(avgsum("swati"));
		
		String s = "5+10/2*6-3";
		char[] gfg = s.toCharArray();
		for (int i = 0; i < gfg.length; i++) {
			System.out.println(gfg[i]);
		}
		System.out.println(gfg[2]);

	}

	static float avgsum(String str) {
		float sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += (int) str.charAt(i);
		}
		sum = sum / str.length();
		return sum;
		
	}
	
}
