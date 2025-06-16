import java.util.*;
public class Earth{
public static void main (String [] args){
	double radius=6378;
	double r3=Math.pow(radius,3);
	//Calculation
	double volume_km=(4/3)*3.14*r3;
	double volume_miles= volume_km*1.6;
	//Output Statement
	System.out.print(" The volume of earth in cubic kilometers is "+ volume_km +" and cubic miles is  "+ volume_miles );
	}
}
