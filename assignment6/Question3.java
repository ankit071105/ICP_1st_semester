import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter The Number");
        int x=sc.nextInt();
              System.out.println("Reverse Number "+reverse(x));
              System.out.println("Is Number is a  Palindrome ? "+isPalindrome(x));
    }
    public static int reverse(int number){
        int d=0;int rem=0;
        while (number>0) {
            rem = number%10;
            d = d * 10 + rem;
            number= number/10;
        }
        return d;
    }
    public static boolean isPalindrome(int number){
        int d=0;int rem=0 , num =number;
        boolean p=false;
        while (number>0) {
            rem = number%10;
            d = d * 10 + rem;
            number= number/10;
        }
       
   if (num ==d) {
    p=true;
   }
            return p;
        }
    
}
