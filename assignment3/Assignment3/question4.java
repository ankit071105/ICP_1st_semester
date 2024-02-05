import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Number for the Game Between 1 to 9");
        int a=sc.nextInt();
        int y =1;
        int z=2;
        int b=(int)(Math.floor(Math.random()*(z-y+1)+y));
    if(a==b)
    {
        System.out.println("You Got The right one "+a+" "+b);
    }else if(a==(b-1) || a==(b+1)){
          System.out.println("You Got Almost the right one "+a+" "+b);
    }else {
          System.out.println("You Got Wrong  one "+a+" "+b);
    }
    }
}
