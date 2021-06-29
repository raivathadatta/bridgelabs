package day5;

import java.util.Iterator;
import java.util.*;

public class tables {
	 

	public static void main(String[] args) {
		//int a=8;
		usingwhile();
		/*
		 * Scanner sc=new Scanner(System.in); boolean check=true;
		 * 
		 * 
		 * while(check){ System.out.println("entrer 1 for table");
		 * System.out.println("enter 0 for stop"); int number=sc.nextInt(); switch
		 * (number) { case(0):{ check=false; break;} case (1):{ // print(); break; }
		 * default :
		 * System.out.println("entered an wrong input plz enter an valid input"); break;
		 * }
		 */
	//	try{
		//}
			}
	 static void  print() {
		 Scanner sc=new Scanner(System.in);
		 try {
		 System.out.println("enter an integer");
			int number;
			if(sc.hasNextInt()) {
				number=sc.nextInt();
				for(int i=1;i<11;i++) {
					int table=number*i;
					System.out.println(number+""+"*"+i+"="+table);
				}}
				else if(sc.hasNextDouble()){
					System.out.println("you enterd a  double");
					
				}
			else if(sc.hasNext()) {
				System.out.println("entered a string");

			}
			else if(sc.hasNextFloat()) {
				System.out.println("entered an folt");
			}
			else if(sc.nextBoolean()) {
				System.out.println("entered an boolean");
			}
			}
		 
		catch (Exception e) {
			// TODO: handle exception
			//System.out.println("entered wrong input");
		}
	}
	 
	 
	static void usingwhile() {
		 boolean  num =true;
	 
		 while(num) {
//			 System.out.println("entrer 1 for table");
//				System.out.println("enter 0 for stop");
		 
		 Scanner sc=new Scanner(System.in);
		
		 System.out.println("enter an integer");
		 System.out.println("enter an 0 for to exit");
			int number;
			
			if(sc.hasNextInt()) {
				
				number=sc.nextInt();
				if(number==0)
					break;
				for(int i=1;i<11;i++) {
					int table=number*i;
					System.out.println(number+""+"*"+i+"="+table);
				}}
				else if(sc.hasNextDouble()){
					System.out.println("you enterd a  double");
					
				}
			else if(sc.hasNext()) {
				System.out.println("entered a string");

			}
			else if(sc.hasNextFloat()) {
				System.out.println("entered an folt");
			}
			else if(sc.nextBoolean()) {
				System.out.println("entered an boolean");
			}
			
		 }
	 }
}



