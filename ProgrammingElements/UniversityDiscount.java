 import java.util.*;
public class UniversityDiscount{
public static void main (String [] args){
	//Input
	Scanner input= new Scanner(System.in);
	double fee=input.nextDouble();
	double discountPercent=input.nextDouble();
	//Calculation
	double discount=(discountPercent/100)*fee;
	double total=fee-discount;
	//Output Statements
	System.out.print(" The discount amount is INR " + discount +" and final discounted fee is INR " + total);
	}
}
