import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the String ");
      String s=sc.nextLine();
        displayMiddleCharacter(s);

    }
    public static void displayMiddleCharacter(String str) {
        int length = str.length();

        if (length == 0) {
            System.out.println("The string is empty.");
            return;
        }

        int middleIndex = length / 2;

        if (length % 2 == 0) {
            char middleChar2 = str.charAt(middleIndex);
            System.out.println("Middle characters: " + middleChar2);
        } else {
            char middleChar = str.charAt(middleIndex);
            System.out.println("Middle character: " + middleChar);
        }
    }
}
