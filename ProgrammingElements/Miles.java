import java.util.*;
public class Miles{
public static void main (String [] args){
	//Input 
	Scanner  input= new Scanner(System.in);
	double km= input.nextDouble();
	// Calculation
	double miles= km*0.6;
	//Output
	System.out.print(" The total miles is "+ miles +" mile for the given "+ km+ " km." );
	}
}
