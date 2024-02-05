import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Year You want to Check");
        int n=sc.nextInt();
        System.out.println("Enter The  Year Till You want to Check");
        int m=sc.nextInt();
        int q=0;
        for (int i = n; i < m; i++) {
           q +=numberOfDaysInAYear(i);
          
        }
        System.out.println(q);
    }
    public static int numberOfDaysInAYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 366;
        } else {
            return 365; 
        }
    }

}
