package day6;
import functionalPrograms.*;
public class Sqrt extends Utility { 
    public static void main(String[] args) { 

    
        double c = getDouble();
        double epsilon = 1.0e-15;  
        double t = c;             

        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }

     
        System.out.println(t);
    }

}
