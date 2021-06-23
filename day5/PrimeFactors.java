package day5;

public class PrimeFactors extends Get{

	public void facors() {
		// TODO Auto-generated method stub
		System.out.println("enter number");
		int num=sc.nextInt();
		//int num=number;
	if(num<=2) {
		System.out.println(num);
	}
	else {
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			
		//System.out.println(num);
			
			while(num%(i*i)==0) {
			num=num/(i*i);//
			
		}
			while(num%i==0) {
				num=num/i;
			//System.out.println(num);
			
		System.out.println(i);
		}
			
	}
	//System.out.println(num);

	}
	if(num>2) {
		System.out.println(num);
	}
	}

}}
