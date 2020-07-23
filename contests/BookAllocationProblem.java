package contest1;

import java.util.Scanner;

public class BookAllocationProblem {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
			int Test=scn.nextInt();//test cases
			int a=1;
			while(a<=Test) {
			int  N=scn.nextInt();//no of Books
			int  S=scn.nextInt();//no of students
			long [] books = new long[N];
			for(int i=0;i<N;i++)
				books[i]=scn.nextLong();
			
			long res=Binarysearchbook(books,N,S);
			System.out.println(res);                                                                     
			a++;
			}
		
	}
	public static long Binarysearchbook(long[] books,int N,int S) {
		long start=0,end=0,mid=0,totalpages=0,max=Integer.MIN_VALUE;
		for(int i=0;i<N;i++)
			totalpages=totalpages+books[i];
			start=books[N-1];
			end=totalpages; 
			if(S==1)
				return totalpages;
			else if(N<S)
				return -1;
		long ans=start;
		while(start<=end) {
			mid=(start+end)/2;
			if(Check(books,N,S,mid))
				{//true 
				ans=mid; 
				//System.out.println("ans="+ans);
				end=mid-1;
				}
			else{ //false
				start=mid+1;
				}
		}
		return ans;
	}
	public static boolean Check(long[] books,int N,int S,long mid) {
		int stud=1; long cur_pages=0;
		for(int i=0;i<N;i++) {
			if(books[i]>mid)
				return false;
			if((cur_pages+books[i])>mid) {  
				cur_pages=books[i];
				stud++;
				if(stud>S)
					return false;
			}
			else{
				cur_pages=cur_pages+books[i];
				}
		}
		return true;
	}
	}

