

import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Marks Got in the Exam By the University");
        int a =sc.nextInt();
        String grade = null;
        if(a>100)
             {
                 System.out.println("Invalid Output");
             }
              else
              {
                switch(a/10) {
 
               case 10:
               
               case 9:
                  grade = "O";
                  break;
      
               case 8:
                  grade = "A";
                  break;
 
               case 7:
                  grade = "B";
                  break;
      
               case 6:
                  grade = "C";
                  break;
 
               case 5:
                  grade = "D";
                  break;
      case 4:
                  grade = "E";
                  break;
               default:
                  grade = "F";
                  break;
             }
             
       
 }
    System.out.println("Grade = " + grade);
    }
}
