import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=sc.nextInt();
        System.out.println();
        System.out.println("A Part ");
         System.out.println(); 
         for (int i = 1; i <= n; i++) {
              char ch ='A';
            for (int j=1;j<=i;j++) {
                      
                System.out.print(ch+" ");
           ch++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("B Part ");
         System.out.println();
        for (int i = n; i >= 1; i--) {
            for (int j=i;j>=1;j--) {
                System.out.print(" $ ");
            }
            System.out.println();
        }
      System.out.println();
        System.out.println("C Part ");
         System.out.println();




         for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    }
