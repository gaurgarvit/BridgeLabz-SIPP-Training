import java.util.*;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();

        if(n>0){
            int i= 1;
            while(i<= n){
                if (i%3== 0 && i%5== 0) {
                    System.out.println("FizzBuzz");
                } else if (i%3== 0) {
                    System.out.println("Fizz");
                } 
                else if (i%5== 0) {
                    System.out.println("Buzz");
                } 
                else {
                    System.out.println(i);
                }
                i++;
            }
        }
        else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
