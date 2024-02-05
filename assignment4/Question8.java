import java.util.Random;
import java.util.Scanner;

public class Question8 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
            Random a = new Random();
        int r = a.nextInt(10) + 1;
        int z = 0;
        for (int i = 1; z != r; i++) {
            System.out.print("Enter your guess (between 1 and 10): ");
            z = sc.nextInt();
            if (z > r) {
                System.out.println("User Guess : "+z);
                System.out.println("Computer Guess : "+r);
                System.out.println("Too high, try again.");
            } else if (z < r) {
                         System.out.println("User Guess : "+z);
                System.out.println("Computer Guess : "+r);
                System.out.println("Too low, try again.");

                
            } else {
                // The guess is correct
         System.out.println("User Guess : "+z);
                System.out.println("Computer Guess : "+r);
                System.out.println("Good guess! You got it in " + i + " attempts.");
            }
        }
   } 
}
