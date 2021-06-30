package day6;

import java.util.Scanner;

public class Coupen {
	   public static int getCoupon() {
	        return (int) ((int)(Math.random()*9000)+1000);

	       // System.out.println();
	    }

	
	  public static void check(int n) {
		//String str1=""+getCoupon();
		//  System.out.println("hear");
		  String str="";  
		  int count=1;
		  while(count<=n) {
			//  System.out.println("hear1");
			  String str1=""+getCoupon();
		  if(str.contains(str1)) {
			  
		  }
		  else 
			  str=str+str1;
		  count++;
		  System.out.println(str1);
		  }
	  }
	  
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println();
	    	System.out.println("enter the numbers of coupens requied");
	        int n =sc.nextInt();
	       // System.out.println(n);
	   //     int count = collect(n);
	        check(n);
	       
	    } 
}
