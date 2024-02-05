import java.util.Scanner;

public class Question9 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }
        int digitCount = 0;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
                if (digitCount >= 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
