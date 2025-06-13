import java.util.*;

public class Factorial{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();

        if (n>=0) {
            int fact= 1, i = 1;
            while(i <= n) {
                fact*= i;
                i++;
            }
            System.out.println("Factorial of " + n + " is " + fact);
        }
        else {
            System.out.println("Please enter a non-negative integer.");
        }
    }
}
