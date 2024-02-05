

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n (number of terms): ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer for n.");
        } else {
            int a = 0;
            int b = 1;
            System.out.println("Fibonacci sequence for the first " + n + " terms:");
            System.out.print(a + ", " + b);
            for (int i = 3; i <= n; i++) {
                int c = a + b;
                System.out.print(", " + c);
                a = b;
                b = c;
            }
        }
        System.out.println();
    }
}
