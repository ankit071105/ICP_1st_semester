import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Age for voting");
        int x =sc.nextInt();
        if(x>=18)
{
    System.out.println("You are eligible to vote");
}else{
       System.out.println("You are not eligible to vote");
}
    }
}
