
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        double x = sc.nextDouble();
        System.out.println("Enter the number of terms in the series: ");
        int terms = sc.nextInt();
        double result = 0;
        int factorial = 1;
        boolean isAddition = true;
        for (int n = 2; n <= terms; n += 2) {
            double term = Math.pow(x, n) / factorial;
    
            if (isAddition) {
                result += term;
            } else {
                result -= term;
            }
            factorial *= (n + 1) * (n + 2);
            isAddition = !isAddition;
        }
       result = 1-result;
       System.out.println(result);
        double p=(double)Math.cos(result);
        System.out.println(p);
    }
}
