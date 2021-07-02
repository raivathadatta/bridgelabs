package day8;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Runner ew=new Runner();
//       // ew.employeeSalary();
//	System.out.println("enter HourlyWages");
//        ew.setHourlyWage(getValue());
//     System.out.println("Enter Working hours per Day");   
//       ew.setWorkingHours_Day(getValue());
//        System.out.println("Enter number of Working Days");
//        ew.setWorkDays(getValue());
////        System.out.println("Enter Total Working Hours");
////        ew.setWorkingHours(getValue());
//        System.out.println("Enter number part time Hours ");
//        ew.setPartTimeHours(getValue());
//        System.out.println("enter total woking hours");
//        ew.setTotalWorkingHours(getValue());
//        ew.employeeSalary();
EmployeeWages employee=new EmployeeWages();
System.out.println("enter HourlyWages");
employee.setHourlyWage(getValue());
System.out.println("Enter number part time Hours ");
employee.setPartTimeHours(getValue());
employee.setTotalWorkingHours(getValue());
System.out.println("Enter number of Working Days");
employee.setWorkDays(getValue());
System.out.println("Enter Total Working Hours");
employee.setWorkingHours(getValue());
System.out.println("Enter Working hours per Day");   
employee.setWorkingHours_Day(getValue());
Runner runner=new Runner();
runner.employeeSalary();
EmployeeWages employee2=new EmployeeWages();



}
public static int getValue() {
	Scanner scanner=new Scanner(System.in);
	int send=scanner.nextInt();
	return send;
}
}
