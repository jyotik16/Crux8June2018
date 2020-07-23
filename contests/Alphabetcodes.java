package contest2;
import java.util.ArrayList;
import java.util.Scanner;
public class Alphabetcodes {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		//String str=scn.nextLine();
		//System.out.println(codes("1123",""));
        System.out.println(code("1123"));
 	   
		}
	public static ArrayList<String>  codes(String str,String asf) {
		if(str.length()==0) {
			ArrayList<String> br = new ArrayList<>();
			br.add(asf);
			return br;
			//System.out.println(asf);
			//return;
		}
			
		String sub1=str.substring(0,1);
		String ros1=str.substring(1);
		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rr = codes(ros1,asf+(char)(Integer.valueOf(sub1)+96));
				
		if(str.length()>1) {

			String sub2=str.substring(0,2);
			String ros2=str.substring(2);
			//ArrayList<String> mr1 = new ArrayList<>();
			int val=(Integer.valueOf(sub2)+96);
			if(val<=122) {
				ArrayList<String> rr1=  codes(ros2,asf+(char)val);
				}
	
		}
		
		return mr;
		
	}

	public static ArrayList<String> code(String s) {
		if (s.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		String r = s.substring(0, 1);
		char c= (char)(Integer.valueOf(r)+96);
		String ros = s.substring(1);
		ArrayList<String> one = code(ros);
		for (String rrs : one) {
			mr.add(c + rrs);
		}

		ArrayList<String> two = new ArrayList<>();
		char c2 = ' ';
		if (s.length() > 1) {
			String r2 = s.substring(0, 2);
			c2 = (char)(Integer.valueOf(r2)+96);
			String ros2 = s.substring(2);
			if (Integer.valueOf(r2) < 27) {

				two = code(ros2);
				for (String rrs2 : two) {
					mr.add(c2 + rrs2);
				}

			}
		}
		return mr;

	}



}
 
