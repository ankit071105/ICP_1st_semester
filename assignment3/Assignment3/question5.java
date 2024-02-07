

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Year You Want to check");
        int x =sc.nextInt();
        if(x%4 == 0 && x % 100 != 0 || x % 400 == 0)
        {
            System.out.println(x +" is a leap year : true");
        }else{
                   System.out.println(x +" is a leap year : false");
        }
    }
}
