 import java.util.*;

public class Perimeter{
	public static void main (String [] args){
// Input
	Scanner input= new Scanner(System.in);
	int side=input.nextInt();
//Calculation
	int perimeter=4*side;
// Printing
	System.out.println(" The length of the side is " +side +" whose perimeter is "+ perimeter);
	}
}