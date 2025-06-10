import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        welcomeMessage();
        addTwoNumbers(s);
        celsiusToFahrenheit(s);
        areaOfCircle(s);
        volumeOfCylinder(s);
        calculateSimpleInterest(s);
        perimeterOfRectangle(s);
        powerCalculation(s);
        averageOfThreeNumbers(s);
        kilometersToMiles(s);
    }

    // 1. Welcome message
    public static void welcomeMessage() {
        System.out.println("Welcome to Bridgelabz!");
    }

    // 2. Add Two Numbers
    public static void addTwoNumbers(Scanner s) {
        System.out.print("Enter first number: ");
        double num1 = s.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = s.nextDouble();
        System.out.println("Sum: " + (num1 + num2));
    }

    // 3. Celsius to Fahrenheit
    public static void celsiusToFahrenheit(Scanner s) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = s.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

    // 4. Area of a Circle
    public static void areaOfCircle(Scanner s) {
        System.out.print("Enter radius of the circle: ");
        double radius = s.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }

    // 5. Volume of a Cylinder
    public static void volumeOfCylinder(Scanner s) {
        System.out.print("Enter radius of the cylinder: ");
        double radius = s.nextDouble();
        System.out.print("Enter height of the cylinder: ");
        double height = s.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of cylinder: " + volume);
    }

    // Self Problems
    // 1. Simple Interest
    public static void calculateSimpleInterest(Scanner s) {
        System.out.print("Enter Principal amount: ");
        double principal = s.nextDouble();
        System.out.print("Enter Rate of interest: ");
        double rate = s.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = s.nextDouble();
        double si = (principal*rate*time) / 100;
        System.out.println("Simple Interest: " + si);
    }

    // 2. Perimeter of a Rectangle
    public static void perimeterOfRectangle(Scanner s) {
        System.out.print("Enter length of rectangle: ");
        double length = s.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = s.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }

    // 3. Power Calculation
    public static void powerCalculation(Scanner s) {
        System.out.print("Enter base: ");
        double base = s.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = s.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
    }

    // 4. Average of Three Numbers
    public static void averageOfThreeNumbers(Scanner s) {
        System.out.print("Enter first number: ");
        double a = s.nextDouble();
        System.out.print("Enter second number: ");
        double b = s.nextDouble();
        System.out.print("Enter third number: ");
        double c = s.nextDouble();
        double average = (a + b + c) / 3;
        System.out.println("Average: " + average);
    }

    // 5. Kilometers to Miles
    public static void kilometersToMiles(Scanner s) {
        System.out.print("Enter distance in kilometers: ");
        double km = s.nextDouble();
        double miles = km * 0.621371;
        System.out.println("Distance in miles: " + miles);
    }
}
