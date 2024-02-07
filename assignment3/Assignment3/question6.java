

import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Electric Unit Consumed By You In A Month");
        int x= sc.nextInt();
        double r =0;
        double p=0,q=0,s=0;
        if(x<50)
        {
           r =x*3;

        }else    if(x>=50 &&x<200)
        {
         p=(x-50)*4.80;
      	r=(50*3.0)+p;

        }else    if(x>=200 &&x<400)
        {
         q=(x-200)*5.80;
         r=(50*3.0)+(150*4.80)+q;

        }else    if(x>=400)
        {
        s=(x-400)*6.20;
         r=(50*3.0)+(150*4.80)+(200*5.80)+s;

        }
        System.out.println("For "+x+" Electric bill consumed is "+r);
    }
}
