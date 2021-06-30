package day6;
import java.util.*;
public class Fibinacci {
static public void fibinacci(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value " );
int num=sc.nextInt();
int a=0;
int b=1;int fib=0;
System.out.println("0");
System.out.println("1");
for(int i=2;i<num;i++) {
	
	fib=a+b;
	System.out.println(fib);
	a=b;
	b=fib;
}
}
public static void main(String[] args) {
	fibinacci();
}
}
