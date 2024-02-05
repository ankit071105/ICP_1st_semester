
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base: ");
        int b = sc.nextInt();

        System.out.print("Enter the exponent: ");
        int e = sc.nextInt();

        int r = 1;
        if (e < 0) {
            b = 1 / b;
            e = -e;
        }

        for (int i = 0; i < e; i++) {
            r *= b;
        }

        System.out.println(b + " raised to the power of " + e + " is: " + r);

    }
}
