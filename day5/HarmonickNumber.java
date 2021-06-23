package day5;

public class HarmonickNumber extends Get {

	public void nthNumber() {
		// TODO Auto-generated method stub
		 int number=sc.nextInt();
		 int  num=number;
		 double value=0;
		 while(number>0) {
			 value+=((double)1/number);
			 number--;
		 }
		 System.out.println(num+"th Harmonic Value"+value);
	}

}
