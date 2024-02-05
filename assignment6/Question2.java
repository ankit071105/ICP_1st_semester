import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter The Number");
       int x=sc.nextInt();

    for (int i = 1; i < x; i++) {
      
    System.out.print(getPentagonalNumber(i)+" \t"+" \t ");

    

    }  
       } 
       public static int getPentagonalNumber(int n){
    int pent=0;
     
         pent = n* (3*n -1)/2;
    
        return pent;
       }}
   