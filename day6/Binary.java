package day6;

public class Binary  extends ToBinary{
public static void main(String[] args) {
System.out.println("enter number");
int n =getValue() ;
String result=  decToBinary(n);
//System.out.println(result);
String [] arr=new String[2];
arr[1]=result.substring(0, 4);
arr[0]=result.substring(3, 8);
String str = arr[0]+arr[1];
int num=Integer.parseInt(str);  
System.out.println(num);
int number=toDecimal(num);
checkPower(number);
}

private static void checkPower(int number) {
	// TODO Auto-generated method stub
	int temp=number;
	int check;
	while(number%2==0) {
		number=number/2;
	}
	if(number==0) {
		System.out.println("the number is power of 2"+" "+temp);
	}
	else
		System.out.println("the number is not power of 2"+" "+temp);
}

private static int toDecimal(int num) {
	// TODO Auto-generated method stub
	int result=0;
	
	 
   
     int base = 1;

     int temp = num;
     while (temp > 0) {
         int last_digit = temp % 10;
         temp = temp / 10;

         result+= last_digit * base;

         base = base * 2;
     }

     return result;
	
}
}
