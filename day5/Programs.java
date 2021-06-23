package day5;
/*//6. Java Program to Compute Quotient and Remainder
7. Java Program to Swap Two Numbers
8. Java Program to Check Whether a Number is Even or Odd
9. Java Program to Check Whether an Alphabet is Vowel or Consonant
10. Java Program to Find the Largest Among Three Numbers*/
public class Programs extends Get {

	public void quotientAndRemainder() {
		// TODO Auto-generated method stub
		System.out.println("enter divisior");
		int divisior=sc.nextInt();
		System.out.println("enter divident");
		int divident=sc.nextInt();
		double remainder=divident%divisior;
		double quotient=divident/divisior;
		System.out.println("The remainder:"+remainder+" "+quotient+"the quotient");
	}
//////////////////////////
	public void swapTwoNumbers() {
		// TODO Auto-generated method stub
		
		System.out.println("enter 1st number");
		int num=sc.nextInt();
		System.out.println("enter 2ed number");
		int num1=sc.nextInt();
	 num=num+num1;
	 num1=num-num1;
	num=num-num1;
	System.out.println("numbers after swap"+num+" "+num1);
	
	}
///////////////////////////////////
	public void numberisEvenorOdd() {
		// TODO Auto-generated method stub
		int number=sc.nextInt();
		
		if(number>0) {
		if(number%2==0)
			System.out.println(number+"is even");
		else
			System.out.println(number+"is odd");
	}
		else
			System.out.println("number is 0");}
///////////////////////////////////////
	public void alphabetIsVoweloConsonant() {
		// TODO Auto-generated method stub
	char ch=sc.next().charAt(0);
	 if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
		       ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		    {
		        System.out.println(" is Vowel."+" "+ ch);
		    }
	  else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
	    {
	      
	       System.out.println("Consonant."+""+ ch);
	    }
	    else 
	    {
	    	   
	           System.out.println(" is not an alphabet."+""+ ch);
	}}
////////////////////////////
	public void largestAmongThreeNumbers() {
		// TODO Auto-generated method stub
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c =sc.nextInt();
		if(a>b) {
			if(a>c)
				System.out.println("1st number is the largest"+a);
			else
				System.out.println("3ed number is the largest"+c);
		}
		else
			if(b>c)
				System.out.println("2ed number is the largest"+b);
			else
				System.out.println("3ed number is the largest"+b);
	}

}
