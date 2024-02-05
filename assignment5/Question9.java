import java.util.*;
public class Question9 {
    public static void main(String[] args) 
{
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();
    
            double totalSum = 0.0;  // Initialize the total sum
    
            for (int i = 1; i <= n; i++) {
                int term =  i * i ;
               double terms=term;
                System.out.print("1/"+term+"  ");
                  double p= 1/terms;
                totalSum += p;
            }
    System.out.println();
            System.out.println("The sum of the series is: " + (float)totalSum);
        }
    }

