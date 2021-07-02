package day8;

public class EmployeeWages {
	private int workDays;
	private int hourlyWage;
	private int workingHours_Day;
	private int totalWorkingHours;
	private int partTimeHours;

	public int getTotalWorkingHours() {
		return totalWorkingHours;
	}

	public void setTotalWorkingHours(int totalWorkingHours) {
		this.totalWorkingHours = totalWorkingHours;
	}

	public int getPartTimeHours() {
		return partTimeHours;
	}

	public void setPartTimeHours(int partTimeHours) {
		this.partTimeHours = partTimeHours;}

	public int getWorkDays() {
		return workDays;
	}

	public void setWorkDays(int workDays) {
		this.workDays = workDays;
	}

	public int getWorkingHours_Day() {
		return workingHours_Day;
	}

	public void setWorkingHours_Day(int workingHours_Day) {
		this.workingHours_Day = workingHours_Day;
	}

	public int getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public int getWorkingHours() {
		return workingHours_Day;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours_Day = workingHours;
	}
}
