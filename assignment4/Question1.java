import java.util.*;

public class Question1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();
    
            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();
    
            System.out.print("Enter the increment value: ");
            int j = scanner.nextInt();
            int sum = 0;
            System.out.println("Counting from " + a + " to " + b + " with an increment of " + j + ":");
            for (int i = a; i <= b; i += j) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.println("\nSum of the numbers displayed: " + sum);
    
    
       
    
        }
    }
    

