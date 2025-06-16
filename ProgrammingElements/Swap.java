 import java.util.*;
public class Swap{
public static void main (String [] args){
	//Input
	Scanner input= new Scanner(System.in);
	int number1=input.nextInt();
	int number2=input.nextInt();
	//Calculation
	int temp=number1;
	number1=number2;
	number2=temp;
// Printing
System.out.println(" The swapped numbers are" +number1 +" and "+ number2 );
}
}