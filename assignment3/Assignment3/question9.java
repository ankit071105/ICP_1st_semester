
import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Three Input Number ");
        int a =sc.nextInt();
                int b =sc.nextInt();
                        int c =sc.nextInt();

                        int la = Math.max(Math.max(a, b), c);

                        int sl;
                        if (a == la) {
                            sl = Math.max(b, c);
                        } else if (b == la) {
                            sl = Math.max(a, c);
                        } else {
                            sl = Math.max(a, b);
                        }
                              System.out.println("Largest Number :"+la);
                              System.out.println("2nd Largest Number :"+sl);
    }
}
