package contest2;
import java.util.Scanner;
public class HelpRamu {
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int t=scn.nextInt();
		while(t!=0) {
			int c1=scn.nextInt();
			int c2=scn.nextInt();
			int c3=scn.nextInt();
			int c4=scn.nextInt();
			int R=scn.nextInt(); // total no of rickshaw
			int C=scn.nextInt(); //total no of cabs
			int[] rlist=new int[R];
			for(int i=0;i<R;i++) {
				rlist[i]=scn.nextInt();
			}
			int[] clist=new int[C];
			for(int i=0;i<C;i++) {
				clist[i]=scn.nextInt();
			}
			ramu(c1,c2,c3,c4,rlist,clist);	
			System.out.println();
			t--;
		}
	}
	public static void ramu(int c1,int c2,int c3,int c4,int[] rlist,int[]clist) {
		//cost of cabs
		int costcabs=0;
		for(int i=0;i<clist.length;i++) {
		 costcabs+=Math.min(clist[i]*c1, c2);
		}
		int costcabs1=Math.min(c3,costcabs);
		//cost of rickshaws
		int costrickhsaw=0;
		for(int i=0;i<rlist.length;i++) {
		 costrickhsaw+=Math.min(rlist[i]*c1, c2);
	}
		int costrickhsaw1=Math.min(c3,costrickhsaw);
		//final answer
		int finalans=Math.min(c4,(costcabs1+costrickhsaw1));
		System.out.println(finalans);
	}
}
