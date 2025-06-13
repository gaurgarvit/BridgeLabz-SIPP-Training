import java.util.Scanner;

public class yougestTallestFriend {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Inputs for Amar
        System.out.println("Enter Amar's age:");
        int age1= sc.nextInt();
        System.out.println("Enter Amar's height:");
        float height1= sc.nextFloat();

        // Inputs for Akbar
        System.out.println("Enter Akbar's age:");
        int age2= sc.nextInt();
        System.out.println("Enter Akbar's height:");
        float height2= sc.nextFloat();

        // Inputs for Anthony
        System.out.println("Enter Anthony's age:");
        int age3= sc.nextInt();
        System.out.println("Enter Anthony's height:");
        float height3= sc.nextFloat();

        // Youngest
        String youngest;
        int minAge= Math.min(age1, Math.min(age2, age3));
        if (minAge== age1) youngest = "Amar";
        else if (minAge== age2) youngest = "Akbar";
        else youngest = "Anthony";

        // Tallest
        String tallest;
        float maxHeight = Math.max(height1, Math.max(height2, height3));
        if (maxHeight== height1) tallest = "Amar";
        else if (maxHeight== height2) tallest = "Akbar";
        else tallest= "Anthony";

        System.out.println("The youngest friend is " + youngest);
        System.out.println("The tallest friend is " + tallest);
    }
}
