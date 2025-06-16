public class Discount{
public static void main (String [] args){
	int fee=125000;
	int discountPercent=10;
	//Calculation
	double discount=(10.0/100)*fee;
	double total=fee-discount;
	//Output Statement
	System.out.print(" The discount amount is INR "+discount +" and final discounted fee is INR "+ total);
	}
}
