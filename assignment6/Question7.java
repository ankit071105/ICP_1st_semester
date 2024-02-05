import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("The Number of Vowel Present in "+s+" is "+count(s));
    }
    public static int count(String str)
    {
       
        int count=0;

    for (int i = 0; i < str.length(); i++) {
        if( str.charAt(i) == 'A' ||  str.charAt(i) == 'E' ||  str.charAt(i) == 'I' ||  str.charAt(i) == 'O' ||  str.charAt(i) == 'U' ||  str.charAt(i) == 'a' ||  str.charAt(i) == 'e' ||  str.charAt(i) == 'i' ||  str.charAt(i) == 'o' ||  str.charAt(i) == 'u'){
            count++;
        }
    }
    return count;
}

}