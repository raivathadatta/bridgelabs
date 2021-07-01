package day8part2;

import java.util.Scanner;

public class Coordinates {

	public String length(Lines j1,Lines j2) {
		Lines l3= new Lines();
		l3.x=(j1.x-j2.x)*(j1.x-j2.x);
		l3.y=(j1.y-j2.y)*(j1.y-j2.y);
		String length=""+Math.sqrt(l3.x+l3.y);
		System.out.println("length"+" "+length);
			return length;
	}
	
	public void compare(String l1,String  l2) {
		int i=l1.compareTo(l2);
		print( i);
	}
	public void print(int i) {
		switch (i) {
		case 0: {
			System.out.println("both are equal");
			break;
		}
		case 1: {
			System.out.println("line 1> line 2");
			break;
		}
		case -1: {
			System.out.println("line 1 <line 2");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + i);
		}
	}
}
