import java.util.Scanner;

public class TriangleTrack {

    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distanceToCover = 5000; // 5 kilometers = 5000 meters
        return distanceToCover / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter side 1 : ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 : ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 : ");
        double side3 = scanner.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);

        System.out.println("The athlete needs to complete approximately " + rounds + " rounds to complete a 5 km run.");
    }
}
