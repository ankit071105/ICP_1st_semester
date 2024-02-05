import java.util.Scanner;

public class question2 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the x ml of water today.");
    int x =sc.nextInt();
    if(x>=5000)
    {
        System.out.println("Yes, Alice is following doctor’s advice");
    }else{
         System.out.println("NO, Alice is not following doctor’s advice");
    }
}
    
}