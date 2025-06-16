import java.util.*;
public class Handshakes{
	public static void main (String [] args){
// Input
	Scanner input= new Scanner(System.in);
	int numberOfStudents=input.nextInt();

//Calculation
	int totalHandshakes=(numberOfStudents * (numberOfStudents - 1)) / 2;
// Printing
	System.out.println(" The total number of possible handshakes are " +totalHandshakes);
	}
}