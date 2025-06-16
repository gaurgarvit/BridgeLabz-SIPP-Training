 import java.util.*;
public class TriangleRounds{
public static void main (String [] args){
	//Input
	Scanner input= new Scanner(System.in);
	int side1=input.nextInt();
	int side2=input.nextInt();
	int side3=input.nextInt();
	//Calculation
	int perimeter=side1+side2+side3;
	int rounds=perimeter/5;
// Printing
System.out.println(" The total number of rounds the athlete will run is " +rounds +" to complete 5 km" );
}
}