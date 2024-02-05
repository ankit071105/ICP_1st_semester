import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int n=0;
        for (int i = 1; i <= number; i++) {
            int square = i * i;
         n += square;

        }
        int d=0;
              System.out.println("The sum of the squares of the first ten natural numbers is: "+n);
        for (int i = 1; i <= number; i++) {
             d += i ;

        }
        int p= d*d;
        System.out.println("The square of the sum of the first ten natural numbers is: "+p);
        int z=p-n;
 System.out.println("sum of the squares of the first ten natural numbers and the square of the sum is  " +z);
    }
}
