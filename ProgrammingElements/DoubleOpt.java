 import java.util.*;
public class DoubleOpt{
public static void main (String [] args){
	//Input
	Scanner input= new Scanner(System.in);
	double a=input.nextDouble();
	double b=input.nextDouble();
	double c=input.nextDouble();
	//Calculation
	double operation_1=a+b*c;
	double operation_2=a*b+c;
	double operation_3=c+a/b;
	double operation_4=a%b+c;
// Printing
System.out.println(" The results of Double Operations are " +operation_1 +" , "+ operation_2 +" , "+ operation_3 +" and " + operation_4);
}
}