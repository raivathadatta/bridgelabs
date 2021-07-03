package day8;

public class Runner {

	/*
	 * public int getWagePerday() { return wagePerday; }
	 * 
	 * public void setWagePerday(int wagePerday) { this.wagePerday = wagePerday; }
	 */
	// static int totalHours;
	static	final int doingParTime = 1;
	static final int doingDaily = 0;
	static int totalHoursPresent = 0;
	static int totalDaysPresent = 0;
	// int wagePerday = 0;
//	static final boolean present = true;
//	static final boolean absent = false;

	private int present() {
		final int isPresent = 1;
		final int isAbsent = 0;
		double key1 = Math.random();
		int key = (int) Math.round(key1);
		switch (key) {
		case isAbsent: {
			return isAbsent;
		}

		case isPresent: {
			return isPresent;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}

	}

	private int check(EmployeeWages employee) {
		while (totalHoursPresent <= employee.getTotalWorkingHours()
				|| totalDaysPresent <= employee.getTotalWorkingHours()) {
		//	System.out.println("hello");
		if (present() == 1) {
			System.err.println("present");
			
				double a = Math.random();
				int key = (int) Math.round(a);
				System.out.println("key");
		
				switch (key) {
				case doingDaily:
					totalHoursPresent += employee.getWorkingHours_Day();
					totalDaysPresent++;
					System.out.println(totalDaysPresent + "totaldays" + totalHoursPresent);
					break;

				case doingParTime:
					totalHoursPresent += employee.getPartTimeHours();
					System.out.println(totalHoursPresent + "totalhours in part time ");
					break;
				default:
					break;
				}
			}
		}
		return totalHoursPresent;
	}

	public void employeeSalary(EmployeeWages employee) {
		int salary = employee.getHourlyWage() * check(employee);
		System.out.println("salary" + salary);
		employee.setEmployeeSalary(salary);

	}

}
