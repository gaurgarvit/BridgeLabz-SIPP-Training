 import java.util.*;
public class Income{
public static void main (String [] args){
	//Input
	Scanner input= new Scanner(System.in);
	int salary=input.nextInt();
	int bonus=input.nextInt();
	//Calculation
	int income=salary+bonus;
// Printing
System.out.println(" The salary is INR "+ salary +" and the bonus is INR "+ bonus+". Hence Total Income is INR "+ income);
}
}