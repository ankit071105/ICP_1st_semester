



import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("What is your gender M or F");
        char c =sc.next().charAt(0);
        if(c == 'M' ||c =='m')
        {
            System.out.println("Enter Your First Name");
            String fname =sc.nextLine();
        
             System.out.println("Enter Your Last Name");
            String lname =sc.nextLine();
             System.out.println("Enter Your Age");
            int age =sc.nextInt();
        
            if(age >= 20){
                    System.out.println("Are You married ? (y or n)");
            char x=sc.next().charAt(0);
                if (x == 'y'|| x=='Y') {
                      System.out.println("Then I shall call  Mr. "+fname+" "+lname);
                }else{
                       System.out.println("Then I shall call "+fname+" "+lname);
                }
        
            }else{
                  System.out.println("Then I shall call "+fname+" "+lname);
            }
        }else if(c == 'F' || c=='f')
        {
    System.out.println("Enter Your First Name");
            String fnames =sc.nextLine();
             System.out.println("Enter Your Last Name");
            String lnames =sc.nextLine();
             System.out.println("Enter Your Age");
            int age =sc.nextInt();
       
            if(age >= 20){
                         System.out.println("Are You married ? (y or n)");
            char x=sc.next().charAt(0);
                      if (x == 'y'||x=='Y') {
                System.out.println("Then I shall call  Mrs. "+fnames+" "+lnames);
                }else{
                     System.out.println("Then I shall call  Ms. "+fnames+" "+lnames);
                }

            }else if(age <=20){
                  System.out.println("Then I shall call "+fnames+" "+lnames);
            }
        }
    }

}
