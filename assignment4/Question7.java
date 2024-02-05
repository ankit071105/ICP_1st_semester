
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The number");
        int x=sc.nextInt();
        System.out.println("Enter The Number Till You Want The Table");
        int n=sc.nextInt();
        int p=1;
        for (int i = 1; i <= n; i++) {
            p=x*i;
            System.out.println(x+" * "+i+" = "+p);
        }
    }
}
