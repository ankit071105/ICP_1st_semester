

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n (greater than 3): ");
        int n = sc.nextInt();

        if (n <= 3) {
            System.out.println("Please enter a value of n greater than 3.");
            return;
        }
        int a = 0, b = 1, c = 1;
        System.out.println("Generated Sequence:");
        System.out.print(a + ", " + b + ", " + c);

        for (int i = 4; i <= n; i++) {
            int nextTerm = a + b + c; 
            System.out.print(", " + nextTerm);
            a = b;
            b = c;
            c = nextTerm;
        }

        System.out.println();  
    }
}
