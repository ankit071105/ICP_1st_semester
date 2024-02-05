
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Table Value From Where You Want to Check");
        int n=sc.nextInt();
        System.out.println("Enter The Value  Till You Want to Check");
         int m=sc.nextInt();
        int c=0,f=1,p=1,a=3;
   
              System.out.println("Multiplication of table of 2");
    for (int i = n; i <= m; i++) {
    for (int j = 1; j <= 10; j++) {
        p =i * f;
        c++;
        f++;
  System.out.println(i+" * "+c+" = "+p);
    }
    c=0;f=1;
          System.out.println("Multiplication of "+a);
          a++;
    }
}

}
