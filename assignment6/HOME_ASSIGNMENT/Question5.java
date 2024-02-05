import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a=sc.nextInt();
        System.out.println("Enter the Second Number");
        int b=sc.nextInt();
        System.out.println("Enter the Third Number");
        int c=sc.nextInt();
        boolean result = areConsecutive(a, b, c);
        System.out.println("Are the numbers consecutive? " + result);
    }
    public static boolean areConsecutive(int num1, int num2, int num3) {
        return (num1 == num2 - 1 && num2 == num3 - 1) || (num1 == num2 + 1 && num2 == num3 + 1);
    }
}
