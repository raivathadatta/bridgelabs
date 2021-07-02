package day8;

public class Runner {
	boolean present = true;
	boolean absent = false;
	static int totalHoursPresent = 0;
	static int totalDaysPresent = 0;
	final int isPresent = 1;
	final int isAbsent = 0;

	private boolean present() {
		double a = Math.random();
		int key = (int) Math.round(a);
		switch (key) {
		case isAbsent: {
			totalDaysPresent++;
			return absent;
		}
		case isPresent: {
			return present;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}

	}

	private int check(EmployeeWages employee) {
		while (totalHoursPresent <= employee.getToalWorkingHours()
				|| totalDaysPresent <= employee.getTotalWorkingDays()) {

			if (present()) {
				double a = Math.random();
				int b = (int) Math.round(a);
				switch (b) {
				case 0:
					totalHoursPresent += employee.getWorkingHours();
					totalDaysPresent++;

					break;
				case 1:
					totalHoursPresent += employee.getPartTmeHours();
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
		System.out.println(salary);
	}
}
