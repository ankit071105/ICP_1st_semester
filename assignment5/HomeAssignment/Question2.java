import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter The number ");
        int n = sc.nextInt(); 

        for (int i = 0; i < n; i++) {
            // Print spaces before the asterisks
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            // Print the asterisks
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
    }
}
}