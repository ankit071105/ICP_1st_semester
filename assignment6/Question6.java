import java.util.Scanner;

public class Question6 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        int occurrences = count(s, c);
        System.out.println("Number of occurrences of '" + c + "' in the string: " + occurrences);
  }  
  public static int count(String str, char a){
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == a) {
            count++;
        }
    }
    return count;
  }
}
