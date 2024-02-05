import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number (N): ");
        int N = sc.nextInt();

        int p = 1;
        while (p * 3 <= N) {
            p *= 3;
        }

      
        System.out.println("The largest power of three less than or equal to " + N + " is: " + p);

    }
}
