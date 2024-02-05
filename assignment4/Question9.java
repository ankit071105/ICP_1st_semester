import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        int r = 0;
        int m = 1;

        while (a > 0) {
            int d = a % 10;

            if (d != 0) {
                r += d * m;
                m *= 10;
            }

            a /= 10;
        }

        System.out.println("After removing zeros: " + r);

    }
}
