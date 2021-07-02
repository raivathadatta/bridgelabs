package day8;

public class Runner {

	/*
	 * public int getWagePerday() { return wagePerday; }
	 * 
	 * public void setWagePerday(int wagePerday) { this.wagePerday = wagePerday; }
	 */
	static int totalHours;
	static int totalHoursPresent = 0;
	static int totalDaysPresent = 0;
	// int wagePerday = 0;
	static final boolean present = true;
	static final boolean absent = false;

	private boolean present() {
		final int isPresent = 1;
		final int isAbsent = 0;
		double key1 = Math.random();
		int key = (int) Math.round(key1);
		switch (key) {
		case isAbsent: {
			return absent;
		}

		case isPresent: {
			return present;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}

	}

	private int check(EmployeeWages employee) {
		
			if (present()) {
				double a = Math.random();
				int key = (int) Math.round(a);
				final int doingParTime = 1;
				final int doingDaily = 0;
				switch (key) {
				case doingDaily:
					totalHoursPresent += employee.getWorkingHours();
					totalDaysPresent++;

					break;

				case doingParTime:
					totalHoursPresent += employee.getPartTimeHours();
					break;
				default:
					break;
				}
			}
			return totalHoursPresent;
		}
		


	public void employeeSalary(EmployeeWages employee) {

		int salary = employee.getHourlyWage() * check(employee);
		System.out.println(salary);
	}

}
