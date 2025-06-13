import java.util.Scanner;

public class power{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int base= s.nextInt();
        int power= s.nextInt();
        int result= 1;

        for (int i=1;i<=power;i++) {
            result*= base;
        }

        System.out.println(base + " raised to the power " + power + " is " + result);
    }
}
