 import java.util.*;
public class Calculator{
public static void main (String [] args){
	//Input
	Scanner input= new Scanner(System.in);
	double number1=input.nextDouble();
	double number2=input.nextDouble();
	//Calculation
	double sum= number1+number2;
	double subtraction=number1-number2;
	double multiplication= number1*number2;
	double division= number1/number2;
	//Output Statements
	System.out.print(" The addition, subtraction, multiplication and division value of 2 numbers "+number1 +" and "+ number2 +" is "+sum +" ,"+subtraction +", "+ multiplication +", and " + division);
	}
}
