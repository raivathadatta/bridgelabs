package day5;



public class LeapYear extends Get{

	public void check() {
		// TODO Auto-generated method stub
		System.out.println("enrrter year");
		int year=sc.nextInt();
		String s=""+year;
		if(s.length()==4)
		print(year);
		else
			System.out.println("somthing went wrong year should be 4 vlaues ");
	}
	
	protected void print(int year) {
		// TODO Auto-generated method stub
	boolean check =leapYear(year);
		if(check)
			System.out.println(year+" "+"leap year");
		else
			System.out.println(year+" "+ "not a leap year");
	}

	private boolean leapYear(int year) {
		// TODO Auto-generated method stub
		if(year%400==0)
			return true;
		else if(year%100==0)
			return false;
		else if(year%4==0)
			return true;
		else
			return false;
	}

}
