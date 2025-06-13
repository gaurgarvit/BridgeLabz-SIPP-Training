import java.util.*;

public class SumCompare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n >= 1) {
            int sumFormula= n*(n+1)/2;

            int sumLoop= 0, i = 1;
            while(i<=n) {
                sumLoop+= i;
                i++;
            }

            System.out.println("Sum using formula: "+ sumFormula);
            System.out.println("Sum using while loop: "+ sumLoop);

            if (sumFormula== sumLoop) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("Mismatch in computations.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}
