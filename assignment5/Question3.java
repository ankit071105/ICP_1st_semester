

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First Number");
        int x=sc.nextInt();
           System.out.println("Enter the Second Number");
           int y=sc.nextInt();
for (int n = x; n <= y; n++) {
               int i,flag=0;      
          int m=n/2;      
           if(n==0||n==1){  
            System.out.println();      
           }else{  
            for(i=2;i<=m;i++){      
             if(n%i==0){       
              flag=1;      
              break;      
              }      
            }      
            if(flag==0)  {
       System.out.println(n+" is prime number"); }  
    }
  }
 }
}
