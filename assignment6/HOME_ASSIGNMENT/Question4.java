import java.util.Scanner;
public class Question4 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the String");
            String inputString = sc.nextLine();
            int wordCount = countWords(inputString);
            System.out.println("Number of words in the string: " + wordCount);
        }
        public static int countWords(String str) {
            if (str == null || str.trim().isEmpty()) {
                return 0;
            }
            String[] words = str.split("\\s+");
            return words.length;
        }
    }
    

