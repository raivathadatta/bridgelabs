package functionalPrograms;

public class Quadratic extends Utility{
void equation() {
System.out.println("Enter prefixes of X^2,x,constant ");
int a=getValue();
int b=getValue();
int c=getValue();
double d=(b*b)-(4*a*c);
System.out.println(-b+Math.sqrt(d/2*a)+" "+"The first root of the eqation having prefixes"+ " "+a+b+c);
System.out.println(-b-Math.sqrt(d/2*a)+" "+"The second root of the eqation having prefixes"+ " "+a+b+c);
}
}
