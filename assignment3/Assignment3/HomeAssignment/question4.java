

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter an integer: ");
		int n = sc.nextInt();
        boolean a ;
        a=	((n % 5 == 0) && (n % 6 == 0));
     boolean   b=((n % 5 == 0) || (n % 6 == 0));
      boolean   c=((n % 5 == 0) ^ (n % 6 == 0));
		System.out.println("Is 10 divisible by 5 and 6? " +a);
		System.out.println("Is 10 divisible by 5 or 6? " +b);
		System.out.println("Is 10 divisible by 5 of 6, but not both? " +c);
    }
}
