

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your choice between 0 to 2");
        int a =sc.nextInt();
        int x=0;
        int y =2;
     int i = (int)(Math.random()*( y -x +1)+x);
        if( i ==0 && a==2){
            System.out.println("The computer is scissor. "+i+" You are Paper. " +a+" You lose " );
        }else if( i ==0 && a==1){
            System.out.println("The computer is scissor. " +i+"  You are Rock. " +a+" You Won ");
        } if( i ==0 && a==0){
            System.out.println("The computer is scissor. " +i+"  You are Scissor. "+a+"  It is draw ");
        }else if( i ==1 && a==2){
            System.out.println("The computer is Rock. "+i+" You are Paper. "+a+" You Won ");
        }else if( i ==1 && a==1){
            System.out.println("The computer is Rock. "+i+" You are Rock. "+a+" It is draw ");
        } if( i ==1 && a==0){
            System.out.println("The computer is Rock. " +i+" You are Scissor. "+a+" You lose ");
        }else  if( i ==2 && a==2){
            System.out.println("The computer is Paper. " +i+"  You are Paper. "+a+" It is draw ");
        }else if( i ==2 && a==1){
            System.out.println("The computer is Paper. " +i+"  You are Rock. "+a+" You Lose ");
        } if( i ==2 && a==0){
            System.out.println("The computer is Paper. " +i+"  You are Scissor. "+a+" You Won ");
        }
    }
}
