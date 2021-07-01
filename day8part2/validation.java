package day8part2;
import  functionalPrograms.*;
public class validation extends Utility{
public static void main(String[] args) {
	Lines l1=new Lines();
	System.out.println("enter x coardenates");
	l1.x=getValue();
	System.out.println("enter y coardenates");
	l1.y=getValue();
	Lines l2=new Lines();
	System.out.println("enter x coardenates");
	l2.x=getValue();
	System.out.println("enter y coardenates");
	l2.y=getValue();
	Lines l3=new Lines();
	System.out.println("enter x coardenates");
	l3.x=getValue();
	System.out.println("enter y coardenates");
	l3.y=getValue();
	Lines l4=new Lines();
	System.out.println("enter x coardenates");
	l4.x=getValue();
	System.out.println("enter x coardenates");
	l4.y=getValue();
Coordinates c=new Coordinates();

String a=c.length(l1, l2);
String a1=c.length(l3, l4);
c.compare(a, a1);
}

}
