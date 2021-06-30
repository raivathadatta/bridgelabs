package day6;

import java.util.*;
import functionalPrograms.Utility;

public class MonthlyPayment extends Utility {
public static void main(String[] args) {
	//Scanner sc= new Scanner(System.in);
	System.out.println("enter the values of p, y,R");
	int p=getValue();
	int y=getValue();
	int R=getValue();
	int n=12*y;
	double r =R/(1200);
	double payment = ((p*r)/(1-(Math.pow((1+r), n)*(-n))));
	System.out.println(payment );
}
}
