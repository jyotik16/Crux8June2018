/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicPrograming;


import java.util.Scanner;
public class UglyNumber {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int t= scn.nextInt();
	while(t>0){
	int len = scn.nextInt();

	System.out.println(uglynum(len));
	t--;
	}
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

