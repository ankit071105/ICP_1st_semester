import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer N: ");
        int a = sc.nextInt();

        int sum = 0;
        int c = 0;

        do {
            int ran = (int) (Math.random() * a) + 1;
            System.out.println("Random number: " + ran);
            sum += ran;
            c++;
        } while (c < a);
        double avg = (double) sum / a;
        System.out.println("Average: " + avg);
                }
            }
