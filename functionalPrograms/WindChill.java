package functionalPrograms;

public class WindChill extends Utility{
void calluclate() {
	System.out.println("enter the values of temparatures and  velocity ");
	double t=getDouble();
	
	double v=getDouble();
	if(t<50&&(v>120||v<3))
	windChillCalluclate(t,v);
	else 
		System.out.println("the rangers entered are wrong plz check");
}

private void windChillCalluclate(double t, double v) {
	// TODO Auto-generated method stub
	double w =  35.74+0.612*t+((0.4275*t)-35.75)*(Math.pow(v, 0.16));
	System.out.println(w);
	//return w;
}
}
