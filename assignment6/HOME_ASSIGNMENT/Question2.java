import java.util.Scanner;

public class Question2 {
   public static int areaofCube(int s){
    int cub = (int)(Math.cbrt(s));
    return cub;
   }
   public static int areaofSphere(int r){
    int Sph = (int)(4/3*Math.PI*Math.cbrt(r));
    return Sph;
   }
   public static int areaofCuboid(int l, int b, int h){
    int cuboid = l * b * h;
    return cuboid;
   }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Side of Cube");
    int a=sc.nextInt();
    System.out.println("Enter the radius of Sphere ");
    int b=sc.nextInt();
    System.out.println("Enter the Length of cuboid");
    int x=sc.nextInt();
    System.out.println("Enter the Breadth of cuboid");
    int y =sc.nextInt();
    System.out.println("Enter the Height of cuboid");
    int z=sc.nextInt();
    System.out.println("Volume of Cube is "+areaofCube(a)+" m^3");
    System.out.println("Volumd of Sphere is "+areaofSphere(b));
    System.out.println("Volume of Cuboid "+areaofCuboid(x,y,z));
   }
}
