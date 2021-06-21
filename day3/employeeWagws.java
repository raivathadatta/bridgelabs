package day3;

import java.util.Random;

public class employeeWagws {
public static void main(String[] args) {


//int employeePresent =b;
	int workingDays=20;
	int hourlyWage=20;
	int workingHours=8;
	int totalWage=0;
	int totalHours=100;
	int totalHoursPresent=0;
	int wagePerday=0;
	for(int i=0;i<workingDays;i++) {
		if(totalHoursPresent<=totalHours) {
	
		System.out.println(i);
		double a= Math.random();
		int b=(int) Math.round(a);
		System.out.println(b);
		switch (b) {
		case 0: {
			break;
			
		}
		case 1: {
			
			
			totalHoursPresent+=workingHours;
			wagePerday=workingHours*hourlyWage;
			totalWage=wagePerday+totalWage;
			System.out.println(totalHoursPresent+" "+totalWage+" "+wagePerday);
			break;
		}
		
		default:
			System.out.println("somthing went worng");
		}
	}
		else 
			break;
	
	
	System.out.println(totalHoursPresent+" "+totalWage+" "+wagePerday);
	System.out.println(totalWage);
}
}}
