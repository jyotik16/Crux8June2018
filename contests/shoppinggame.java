package lec1_pattern;

import java.util.Scanner;

public class shoppinggame {
	  public static void main(String args[]) {
		  Scanner scn = new Scanner(System.in);
			   int t = scn.nextInt();
			   int sum_a=0,sum_h=0 ;

			   while(t>0){
			       int m = scn.nextInt();
			       int n = scn.nextInt();
			       sum_a=0 ;
			       sum_h=0;
			       int i =1 ;
			       int j =2 ;
			       while(sum_a<=m) {
			           sum_a+=i;
			           i+=2;
			          }
			       while(sum_h<=n) {
			           sum_h+=j;
			           j+=2;
			           
			       }
			       if(sum_a<m && sum_h>n){
			           sum_a+=i ;
			       }
			       if(sum_a>sum_h){
			       System.out.println("Aayush");
			       }
			        else {
			       System.out.println("Harshit");
			       }

			       t--;
			   }

}
}
