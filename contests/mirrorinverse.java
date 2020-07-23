package contest;

import java.util.Scanner;

public class mirrorinverse {

	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
		  int n=scn.nextInt();
		  int c=0,i=1,j=1,k=1,m,t=0;
		  int[] arr;
		  arr = new int[99999999];
		  int rem=0;
		  m=n;
		  //count digits
		  while(m!=0)
		  {
			  c++;
			  rem=m%10;
			  arr[k]=rem;
			  k++;
			  m=m/10;
			  
		  }
		  //copy in array and check
		  rem=0; int p=1;
		   while(j<=c)
		  {
			 
			   rem=n%10;  
			   if(arr[rem]==p)
			   {  t++; }
			   else
			   { t--; }
			   
			   p++;
			   n=n/10;
			   j++;
		  }
		  if(t==c)
			  System.out.println("true");
		  else
			  System.out.println("false");
		  
}
}