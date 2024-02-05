import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number till You Want Check");
        int n=sc.nextInt();
        int sum=0;
        int p=1;
        for (int i = 1; i <= n; i++) {
            if ( i %2 ==0) {
                sum +=i;
            }else if (i %2 !=0) {
                p *= i;
            } 
        }
        System.out.println("Product of all odd numbers = "+sum);
        System.out.println("Product of all odd numbers = "+p);
    }
}
