/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicPrograming;


import java.util.Scanner;

public class CoinChangeWays {
    
    public int numberOfSolutionsOnSpace(int total, int arr[]){

        int temp[] = new int[total+1];

        temp[0] = 1;
        for(int i=0; i < arr.length; i++){
            for(int j=1; j <= total ; j++){
                if(j >= arr[i]){
                    temp[j] += temp[j-arr[i]];
                }
                
            }
            
        }
       
        return temp[total];
    }


    public static void main(String args[]){
        CoinChangeWays cc = new  CoinChangeWays() ;
        Scanner scn = new Scanner(System.in);
        int total = scn.nextInt();
        int n = scn.nextInt();
        int[] coins = new int[n];
        for(int i=0;i<n;i++){
        coins[i] = scn.nextInt();
        }
        System.out.println(cc.numberOfSolutionsOnSpace(total, coins));
   
    }
}


