

import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Electric Unit Consumed By You In A Month");
        int x= sc.nextInt();
        int r =0;
        if(x<50)
        {
           r =x*3;
        }else    if(x>=50 &&x<200)
        {
           r = (int) (x*4.80);
        }else    if(x>=200 &&x<400)
        {
           r = (int) (x*5.80);
        }else    if(x>=400)
        {
           r = (int) (x*6.20);
        }
        System.out.println("For "+x+" Electric bill consumed is "+r);
    }
}
