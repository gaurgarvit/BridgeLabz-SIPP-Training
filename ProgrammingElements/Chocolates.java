 import java.util.*;
public class Chocolates{
public static void main (String [] args){
	//Input
	Scanner input= new Scanner(System.in);
	int numberOfchocolates=input.nextInt();
	int numberOfChildren=input.nextInt();
	//Calculation
	int received=numberOfchocolates/numberOfChildren;
	int remaining=numberOfchocolates%numberOfChildren;
// Printing
System.out.println("  The number of chocolates each child gets is "+ received +" and the number of remaining chocolates is" + remaining);
}
}