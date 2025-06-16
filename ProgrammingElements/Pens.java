public class Pens{
public static void main (String [] args){
	int totalPens=14;
	int students=3;
	//Calculations
	int qty=totalPens/students;
	int remainder=totalPens%students;
	//Output Statement
	System.out.print(" The Pen Per Student is "+ qty +" and the remaining pen not distributed is "+ remainder);
	}
}
