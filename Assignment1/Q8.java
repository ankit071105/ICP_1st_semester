
public class Q8 {
    public static void main(String[] args) {
       
        int a =10, b=20;
        System.out.println("The Value of a is Before Swap is "+a);
        System.out.println("The Value of b is Before Swap is "+b);
          a =a^b;
          b=a^b;
          a=a^b;
        System.out.println();
        System.out.println("The Value of a is After Swap is "+a);
        System.out.println("The Value of b is After Swap is "+b);
    }
}
