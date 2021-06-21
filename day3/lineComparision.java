package day3;

import java.util.Scanner;

public class lineComparision {
public static void main(String[] args) {
	int x1=2;
	int y1=3;
	int x2=20;
	int y2=40;
	int x=(x1-x2)*(x1-x2);
	int y=(y2-y1)*(y2-y1);
	Scanner sc=new Scanner(System.in);
	int x3=20;
	int y3=26;
	int x4=40;
	int y4=52;
	int xa=(x3-x4)*(x3-x4);
	int yb=(y3-y4)*(y3-y4);
	//int coordinates[][]=new int[2][4];
	System.out.println("enter x  and y coardinates ");
	/*
	 * for(int i=0;i<4;i++) {
	 * 
	 * for (int j=0;j<2;j++) {
	 * 
	 * coordinates[i][j]=sc.nextInt();
	 * 
	 * 
	 * }
	 * 
	 * }
	 */
	String length2=""+Math.sqrt(xa+yb);
	String length=""+Math.sqrt(x+y);
	System.out.println(length);
	if(length.equals(length2)) {
	System.out.println("both are equal");	
	}
	else
		System.out.println("not equal");
	
	System.out.println(length.compareTo(length2));
}
}
