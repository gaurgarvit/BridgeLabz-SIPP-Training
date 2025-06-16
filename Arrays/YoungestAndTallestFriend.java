import java.util.Scanner;
public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};

        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = s.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = s.nextDouble();
        }

        int minAgeIndex = 0, maxHeightIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAgeIndex]) minAgeIndex = i;
            if (heights[i] > heights[maxHeightIndex]) maxHeightIndex = i;
        }

        System.out.println("Youngest friend: " + names[minAgeIndex]);
        System.out.println("Tallest friend: " + names[maxHeightIndex]);
    }
}