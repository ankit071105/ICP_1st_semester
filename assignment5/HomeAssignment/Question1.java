import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int c=5;
        for (int i=1;i<=5;i++) {
            for (int j=5;j>=1;j--) {
                if (i==j) 
                {
                    System.out.print(" *  "); 
                }
                System.out.print(j+" ");
         
            }
            System.out.println();
        }
    }
}
