import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Three Number ");
        int a=sc.nextInt();
          int b=sc.nextInt();
            int c=sc.nextInt();
        if(a>b && a>c && b>c)
        {
         System.out.println("Decreasing");
        }else if (a<b && a<c && b<c) {
              System.out.println("Increasing");
        }else
        {
 System.out.println("Neither Increasing nor Decreasing");
        }
        }
}
