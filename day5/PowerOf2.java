package day5;

public class PowerOf2 extends LeapYear{

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		int num = sc.nextInt();
		int power=1;
		
			
		if(0<num && num<31)
			while(num>0){
				power*=2;
				num--;
			}
		else
			System.out.println("somthing went wrong the input range sholud be 0<Number<31");
		System.out.println(power);
		print(power);
	}
	

}
