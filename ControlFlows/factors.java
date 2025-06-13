import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int number= s.nextInt();

        if(number> 0){
            System.out.println("Factors of " + number + " are:");
            for (int i=1;i<=number;i++) {
                if (number%i== 0) {
                    System.out.println(i);
                }
            }
        } 
        else{
            System.out.println("Please enter a positive integer.");
        }
    }
}
