package day6;
import java.util.*;
public class PerfectNUmber {
void perfect() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();int sum=0;
	  for(int i = 1; i < n; i++)
      {
          if(n % i == 0)
          {
              sum = sum + i;
          }
      }
      if(sum == n)
      {
          System.out.println("Given number is Perfect");
      }
      else
      {
          System.out.println("Given number is not Perfect");
      }    
}
}
