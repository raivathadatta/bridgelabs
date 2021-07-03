package day8;

public class EmployeeWages {
	private int workDays;
	private int hourlyWage;
	

	private int workingHours_Day;
	private int totalWorkingHours;
	private int partTimeHours;
	private String companyName;
	private int employeeSalary;



//	public EmployeeWages(String companyName, int workDays, int hourlyWage, int workingHours_Day, int totalWorkingHours,
//			int partTimeHours, int employeeSalary) {
//
//		this.workDays = workDays;
//		this.hourlyWage = hourlyWage;
//		this.workingHours_Day = workingHours_Day;
//		this.totalWorkingHours = totalWorkingHours;
//		this.partTimeHours = partTimeHours;
//		this.companyName = companyName;
//		this.employeeSalary = employeeSalary;
//	}

	@Override
	public String toString() {
		return "EmployeeWages [workDays=" + workDays + ", hourlyWage=" + hourlyWage + ", workingHours_Day="
				+ workingHours_Day + ", totalWorkingHours=" + totalWorkingHours + ", partTimeHours=" + partTimeHours
				+ ", companyName=" + companyName + ", employeeSalary=" + employeeSalary + "]";
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

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
		this.partTimeHours = partTimeHours;
	}

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
