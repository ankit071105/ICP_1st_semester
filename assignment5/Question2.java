
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number You Want To Check");
        int n, r,sum=0 , flag;  
        n = sc.nextInt();  
      int a=n;
            while(n!=0)  
            {  
            r = n%10;  
            sum = sum*10 + r;  
            n= n/10;  
            }  
            
        flag = 0;  
        for (int j = 2; j <= sum / 2; j++)  
        {  
            if ((sum % j) == 0)  
            {  
                flag = 1;  
                break;  
            }  
        }  
        if (flag == 0)  
                System.out.println(a+" is a Twisted Prime");  
         else  
                System.out.println(a+" is not a Twisted Prime");  


    }
    }

