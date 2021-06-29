package functionalPrograms;

public class Distance extends Utility {
void distance() {
	System.out.println("Enter the coardenates");
	int x=getValue();
	int y=getValue();
printDistance(x,y);
}

private void printDistance(int x, int y) {
	// TODO Auto-generated method stub
	double distance=Math.sqrt(x*x+y*y);
System.out.println(distance);	
}
}
