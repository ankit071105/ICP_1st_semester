import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // for (int i = 1; i <=4; i++) {
        //     for (int j = 1; j <= i; j++)
        //         System.out.print(j+" ");
        //     for (int k = 1; k <= i-1; k++)
        //         System.out.print(k+ " ");
        //          for (int z = 1; z <= i-2; z++)
        //         System.out.print(z+ " "); 
     
            
        //     System.out.println();

        // }

        int n=4;
        String s="";
      for (int i = 1; i <= n; i++) {
        s=s+" "+i+" "+s;
        System.out.println(s);
      }
    }
}
