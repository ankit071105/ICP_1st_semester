

import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
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

       System.out.println("Do You want to pay online Press Y or N ");
       char c =sc.next().charAt(0);
       double dis =0.0;
       if(c == 'y'||c =='Y'){
        dis = r*(3/100.0);

       }else{
        System.out.println("No Discount");
       }
       System.out.println();
       System.out.println("Number of Units Consumed "+x);
              System.out.println("Total Amount "+r);
              System.out.println("Discount "+dis);
    int amt = (int) (r-dis);
    System.out.println("Amount Payable "+amt);







    }
}
