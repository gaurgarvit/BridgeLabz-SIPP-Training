 import java.util.*;
public class IntOpt{
public static void main (String [] args){
	//Input
	Scanner input= new Scanner(System.in);
	int a=input.nextInt();
	int b=input.nextInt();
	int c=input.nextInt();
	//Calculation
	int operation_1=a+b*c;
	int operation_2=a*b+c;
	int operation_3=c+a/b;
	int operation_4=a%b+c;
// Printing
System.out.println(" The results of Int Operations are " +operation_1 +" , "+ operation_2 +" , "+ operation_3 +" and " + operation_4);
}
}