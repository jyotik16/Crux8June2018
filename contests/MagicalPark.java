package contest1;
import java.util.Scanner;

public class MagicalPark {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int R=scn.nextInt();	//row
		int C=scn.nextInt();	//column
		int K=scn.nextInt();	//minimum strength
		int S=scn.nextInt();	//initial strength
		char[][] res = takeinput(R,C);
		Magicalpark(res,R,C,K,S);
		

}
	public static char[][] takeinput(int R,int C) {
		char [][] ar = new char[R][C];
		for (int i = 0; i <R; i++) {
			for(int j=0;j<C;j++)
			ar[i][j] = scn.next().charAt(0);
			}
		
		return ar;
	}
	public static void Magicalpark(char[][] ar,int R,int C,int K,int S) {
		int PiyushS=S;
		for (int i = 0; i <R; i++) {
			int c=-1;
			
			for (int j = 0;j <C; j++) 
				{
				if(PiyushS<K) {
					System.out.println("No");
					return;
				}
				
				if(PiyushS>=K) {
						c++;
						if(ar[i][j]=='.')
						{
							if(PiyushS<K)
							{ break;  }
							else
						   { PiyushS-=2; } 
						}
						if(ar[i][j]=='*')
						{
							if(PiyushS<K)
							{ break; }
							else
							{ PiyushS+=5;}
						}
						if(ar[i][j]=='#')
						{ break;} 
			
				}
				
				
			}
			PiyushS-=c;
			}
		
			
		if(PiyushS>=K)
			{
			System.out.println("Yes"); System.out.println(PiyushS); 
			}
			
}
}