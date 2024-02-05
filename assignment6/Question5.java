import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number of Side of Polygon");
        int a=sc.nextInt();
        System.out.println("Enter the length of Side ");
        double b=sc.nextDouble();
        System.out.println("Area of Polygon is "+(int)area(a, b));
    }
    public static double area(int n, double side){
        double a = (n * side * side)/(4 * Math.tan(Math.PI/n));
        return a;
    }
}
