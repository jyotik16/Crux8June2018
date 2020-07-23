package contest2;
import java.util.Scanner;
public class Count1 {
	public static void main(String args[]) {
	       Scanner scn=new Scanner(System.in);
	       String s=scn.next();
	      
	       System.out.println(count1(s,"aaa",0));
	       System.out.println(count2(s,"aaa",0));
	    }
	    public static int count1(String s,String str,int c){
	        if(s.length()<str.length()){
	            return c;
	        }
	        
	       String ros=s.substring(1);
	       String tocompare=s.substring(0,str.length());
	       
	       if(str.equals(tocompare)){
	                     
	        return   count1(ros,str,c+1);
	       }else{
	         return  count1(ros,str,c);
	       }
	       
	    }
	    public static int count2(String s,String str,int c){
	        if(s.length()<str.length()){
	            return c;
	        }
	        
	       String ros=s.substring(str.length());
	       String tocompare=s.substring(0,str.length());
	       
	       if(str.equals(tocompare)){
	           
	           
	        return   count2(ros,str,c+1);
	       }else{
	         return  count2(ros,str,c);
	       }
	       
	    }

}
