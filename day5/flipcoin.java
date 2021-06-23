package day5;

import java.util.Scanner;

public class flipcoin extends Get {

	public void getValue() {
		// TODO Auto-generated method stub
	System.out.println("enter no of flips");
	int flips=sc.nextInt();
	print(flips);
	
	}
	static public void print(int flips) {
		// TODO Auto-generated method stub
		//double check=Math.random();
		int total = flips;
		double head=0,tail=0;
	while(flips>0) {
		double check=Math.random();
		/*
		 * System.out.println(check); System.out.println(flips);
		 * System.out.println(head); System.out.println(tail);
		 */
		if(check>0.5)
			head++;
		else
			tail++;
		
		flips--;
		
	}
	double propabulityOfHeads=((head*100)/total);
	double propabulityOfTail=((tail*100)/total);
	System.out.println(propabulityOfHeads);
	System.out.println(propabulityOfTail);
}
	}
	


