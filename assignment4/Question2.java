import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number you want to check");
        int num =sc.nextInt();
       int a=num;
        int d =0,s=0;
        while (a > 0) {
        d += a % 10;
        a/= 10;

        }
        if (d % 9 == 0){
        System.out.println("The number  " +num+" is divisible by 9. ");
        }
   else{
        System.out.println("The number  " +num+" is not divisible by 9. ");
        }

    }
    }

