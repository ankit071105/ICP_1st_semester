import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question1 {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        char firstNonRepeatedChar = findFirstNonRepeatedCharacter(inputString);
        if (firstNonRepeatedChar != '\0') {
            System.out.println("First non-repeated character: " + firstNonRepeatedChar);
        } else {
            System.out.println("No non-repeated character found.");
        }
  }  
  public static char findFirstNonRepeatedCharacter(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (charCountMap.get(ch) == 1) {
                return ch;
            }
        }
        return '\0';
    }
}
