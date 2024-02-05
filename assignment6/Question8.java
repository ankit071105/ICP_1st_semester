import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.err.println("Enter the String to check");
        String input = sc.nextLine();
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
          
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
