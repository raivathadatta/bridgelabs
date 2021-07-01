package day8;

public class EmployeeWages {
	int workDays=20;
	int hourlyWage=20;
	int workingHours=8;
     int totalWage=0;
	//int totalHours=100;
 	static	int totalHoursPresent=0;
	static int totalDaysPresent=0;
	int wagePerday=0;
 private int present() {
	double a= Math.random();
	int b=(int) Math.round(a);
	switch (b) {
	case 0: {
		return 0;
		}
	case 1: {
		return 1;
	}
	default:
		throw new IllegalArgumentException("Unexpected value: " + b);
	}

}
private int check() {
	while(totalHoursPresent<=100||totalDaysPresent<=20) {
int present=present();
	if(present==1) {
		double a= Math.random();
		int b=(int) Math.round(a);
		switch (b) {
		case 0:
			totalHoursPresent+=workingHours;
			totalDaysPresent++;
			
			break;
        case 1:
			totalHoursPresent+=workingHours;
			break;
		default:
			break;
		}
	}
	
}
	return totalHoursPresent;
	}
public void employeeSalary() {
	int salary=hourlyWage*check();
	System.out.println(salary);
}
}
