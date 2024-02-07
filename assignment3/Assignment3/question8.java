

import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
 System.out.println("Enter two point ");

 double a = sc.nextDouble();
 double b = sc.nextDouble();

 if (a == 0 && b == 0) {
     System.out.println("Point is at the origin.");
 } else if (a == 0 && b !=0) {
     System.out.println("(" + a+ ", " + b+ ") is on the y-axis.");
 } else if (b == 0 && a!=0) {
     System.out.println("(" + a + ", " +b+ ") is on the x-axis.");
 } else {
     String quadrant;
     if (a > 0 && b > 0) {
         quadrant = "quadrant I";
     } else if (a < 0 && b > 0) {
         quadrant = "quadrant II";
     } else if (a < 0 && b < 0) {
         quadrant = "quadrant III";
     } else {
         quadrant = "quadrant IV";
     }
     System.out.println("(" + a + ", " + b + ") is in " + quadrant);
 }
}
}