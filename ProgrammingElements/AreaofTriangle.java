  import java.util.*;
public class AreaofTriangle{
public static void main (String [] args){
	//Input
	Scanner input= new Scanner(System.in);
	int base=input.nextInt();
	int height= input.nextInt();
	//Calculation
	double area= 0.5*base*height;
	//Output Statements
	System.out.print(" The area of a triangle in square centimeters is "+ area  );
	}
}
