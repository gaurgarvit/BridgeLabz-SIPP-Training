import java.util.*;
public class TemperatureConversion{
public static void main (String [] args){
	//Input 
	Scanner  input= new Scanner(System.in);
	double celsius= input.nextDouble();
	// Calculation
	double farenheitResult= (celsius*9/5)+32;
	//Output
	System.out.print(" The "+ celsius +" celsius is "+ farenheitResult +" Farenheit" );
	}
}

 