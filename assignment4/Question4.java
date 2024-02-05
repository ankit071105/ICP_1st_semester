import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = sc.nextInt();

        System.out.print("Enter the second number: ");
        int y = sc.nextInt();
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        System.out.println("Greatest Common Divisor (GCD): " + x);

    }
}
