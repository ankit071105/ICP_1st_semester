import java.util.Scanner;

public class Question10 {
    public static double areaTriangle(double b , double h){
     double trian = 0.5*b*h;
        return trian;
    }
    public static int areaRectangle(int a , int c){
        int rect =a * c;
        return rect;
    }
    public static int areaSquare(int x){
        int Sq = x * x;
        return Sq;
    }
    public static int areaCircle(int y){
        int Ci= (int)(Math.PI*y*y);
return Ci;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Triamgle Base");
    Double m=sc.nextDouble();
    System.out.println("Enter Triangle Height");
    Double n=sc.nextDouble();

    System.out.println("Enter Lenght of Rectangle ");
    int i=sc.nextInt();
    System.out.println("Enter Breadth of Rectangle ");
    int j=sc.nextInt();
    System.out.println("Enter The Side of Square ");
    int k=sc.nextInt();
    System.out.println("Enter radius of Circle");
    int r =sc.nextInt();

    System.out.println("Area of Triangle is "+(int)areaTriangle(m,n)+" m^2");
    System.out.println("Area of Rectangle is "+areaRectangle(i,j)+" m^2");
    System.out.println("Area of Square is "+areaSquare(k)+" m^2");
    System.out.println("Area of Circle "+areaCircle(r)+" m^2");

}
}
