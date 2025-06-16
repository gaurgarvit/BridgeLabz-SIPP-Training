import java.util.*;
public class Pounds{
public static void main (String [] args){
	//Input 
	Scanner  input= new Scanner(System.in);
	double weight= input.nextDouble();
	// Calculation
	double total= weight*2.2;
	//Output
	System.out.print(" The weight of the person in pounds is "+ weight +" and in kg is "+ total );
	}
}

 