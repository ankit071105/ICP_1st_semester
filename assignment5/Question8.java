import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int Sum = 0; 

        for (int i = 1; i <= n; i++) {
            int sum1 = 0; 
            for (int j = 1; j <= i; j++) {
                sum1 += j; 
            }
            System.out.print(sum1+" +"+" ");
            Sum += sum1;
        }
        System.out.println();

        System.out.println("The sum of the series is: " + Sum);
    }
}
