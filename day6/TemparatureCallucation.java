package day6;

import java.util.Scanner;

import linkedlist.Main;

public class TemparatureCallucation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("press 1 for Celsius to Fahrenheit:");
	System.out.println("press 2 for Fahrenheit to Celsius:");
	/* Celsius to Fahrenheit: (°C × 9/5) + 32 = celsius
Fahrenheit to Celsius: (°F − 32) x 5/9 = °C*/
	int check =sc.nextInt();
	switch (check) {
	case 1: {
		
	// Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
		double celsius=sc.nextDouble();
	double	fahrenheit =(celsius*(9/5))+32;
	System.out.println(fahrenheit+""+ "°F");
	break;
	}
	case 2: {
		
		// Fahrenheit to Celsius: (°F − 32) x 5/9 = °C*/
		double fahrenheit=sc.nextDouble();
		double celsius = (fahrenheit-32)*(5/9);
		System.out.println(celsius+""+"°C");
		break;
		}
	default:
	System.out.println("entered a wrong option ");
	}
}
}
