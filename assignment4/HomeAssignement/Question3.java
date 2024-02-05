import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
 
                int count = 0; 
        
                for (int i = 1000; i <= 2000; i++) {
                   
                    if (i % 5 == 0) {
                        System.out.print(i + " ");
                        count++;
        
               
                        if (count == 5) {
                            System.out.println();
                            count = 0;
                        }
                    }
                }
            }
        }
