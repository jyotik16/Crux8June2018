package contest1;
import java.util.Scanner;
public class HelpRahulSerach {
	static Scanner scn = new Scanner(System.in);
public static void main(String[] args) {
	int N = scn.nextInt(); int[] ar=new int[N];
	for(int i=0;i<N;i++)
		ar[i]=scn.nextInt();
	int item=scn.nextInt();
	System.out.println(toSearch(ar,item));
	
}
public static int toSearch(int[] ar,int item) {
	int n=ar.length;
	int P=findpivot(ar,0,n-1);
	if(P==-1)
		return binaryS(ar,0,n-1,item);
	if (ar[P] == item)
        return P;
    if (ar[0] <= item)
        return binaryS(ar, 0, P-1, item);
    
    return binaryS(ar, P+1, n-1,item);
}
public static int findpivot(int[] ar,int low,int high) {
	if (high < low)  
        return -1;
   if (high == low) 
        return low;
   int mid = (low + high)/2;   
   if (mid < high && ar[mid] > ar[mid + 1])
       return mid;
   if (mid > low && ar[mid] < ar[mid - 1])
       return (mid-1);
   if (ar[low] >= ar[mid])
       return findpivot(ar, low, mid-1);
   
   return findpivot(ar, mid + 1, high);
}
static int binaryS(int ar[], int low, int high, int item)
{
   if (high < low)
       return -1;
       
   int mid = (low + high)/2;  
   if (item == ar[mid])
       return mid;
   if (item > ar[mid])
       return binaryS(ar, (mid + 1), high, item);
   return binaryS(ar, low, (mid -1), item);
}

}
//complexity=logn
