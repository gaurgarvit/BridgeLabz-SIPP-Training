public class Profit{
public static void main (String [] args){
	int costPrice=129;
	int sellingPrice=191;
	//Computation
	int profit=sellingPrice-costPrice;
	double profitPerc=(profit/costPrice)*100;
	//Output Statement
	System.out.print(" The Cost Price is INR " + costPrice +" and Selling Price is INR " +sellingPrice + ". The Profit is INR "+profit +" and the Profit Percentage is "+ profitPerc );
	}
}
