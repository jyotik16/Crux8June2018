package DynamicProgramming;

import java.util.Scanner;
public class UglyNumber {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int t= scn.nextInt();
	while(t>0) {
	int len = scn.nextInt();
//	int[] res = uglynumseries(len);
//	for(int i =0;i<res.length;i++) {
//		System.out.print(res[i]+" ");
//	}
	System.out.println();
	System.out.println(uglynum(len));
	t--;
	}
}
static int[]  uglynumseries(int len) {
	int[] arr =new int[len];
	 int count = 1;
     arr[0] = 1;
     int i2 = 0;
     int i3 = 0;
     int i5 = 0;
     while(count < len){
         int minNumber = Math.min(Math.min(arr[i2] * 2,arr[i3] * 3),arr[i5] * 5);
         if(minNumber == arr[i2]*2){
             i2++;
         }
         if(minNumber == arr[i3]*3){
             i3++;
         }
         if(minNumber == arr[i5]*5){
             i5++;
         }
         arr[count++] = minNumber;
     }
     
     return arr;
 }

static long  uglynum(int len) {
	long[] arr =new long[len];
	 int count = 1;
     arr[0] = 1;
     int i2 = 0;
     int i3 = 0;
     int i5 = 0;
     while(count < len){
         long minNumber = Math.min(Math.min(arr[i2] * 2,arr[i3] * 3),arr[i5] * 5);
         if(minNumber == arr[i2]*2){
             i2++;
         }
         if(minNumber == arr[i3]*3){
             i3++;
         }
         if(minNumber == arr[i5]*5){
             i5++;
         }
         arr[count++] = minNumber;
     }
     
     return arr[len-1];
 }

}


