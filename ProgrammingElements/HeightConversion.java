 import java.util.*;
public class HeightConversion{
public static void main (String [] args){
	//Input
	Scanner input= new Scanner(System.in);
	int height=input.nextInt();
	//Calculations
	double inches= height/2.54;
    double feet= (inches/12);
	double rem=inches-(feet*12);
	//Output Statements
	System.out.print(" Your Height in cm is "+ height +" while in feet is "+feet +" and inches is "+ rem);
	}
}
