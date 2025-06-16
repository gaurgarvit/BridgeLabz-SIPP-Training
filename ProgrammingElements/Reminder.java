 import java.util.*;
public class Reminder{
public static void main (String [] args){
	//Input
	Scanner input= new Scanner(System.in);
	int number1=input.nextInt();
	int number2=input.nextInt();
	//Calculation
	int reminder=number1%number2;
	int quotient=number1/number2;
// Printing
System.out.println("  The Quotient is " +quotient +" and Reminder is "+ reminder +" of two number "+ number1 +" and " + number2);
}
}