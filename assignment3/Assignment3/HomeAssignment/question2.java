

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number Between O to 6 to see the week days name");
        int day =sc.nextInt();
        String s =" ";
        System.out.println("Enter the Number Between O to 6 to see the Future days name");
  int p =sc.nextInt();
  int c = (day + p) % 7;
        switch (day) {
         
            case 0:
            s ="Sunday";
                break;
           case 1:
            s ="Monday";
                break;
                   case 2:
            s ="Tuesday";
                break;
                   case 3:
            s ="Wednesday";
                break;
                   case 4:
            s ="Thrusday";
                break;
                   case 5:
            s ="Friday";
                break;
                   case 6:
            s ="Saturday";
                break;
            default:
             System.out.println("Invalid Output");
                break;
        }
      
        if (c == 0){
            System.out.println("Today is "+s+" and the future day is Sunday");
    }else if (c == 1){
            System.out.println("Today is "+s+" and the future day is Monday");
    }
    else if (c == 2){
            System.out.println("Today is "+s+" and the future day is Tuesday");
    }
    else if (c == 3){
            System.out.println("Today is "+s+" and the future day is Wednesday");
    }
    else if (c == 4){
            System.out.println("Today is "+s+" and the future day is Thrusday");
    }
    else if (c == 5){
            System.out.println("Today is "+s+" and the future day is Friday");
    }
    else if (c == 6){
            System.out.println("Today is "+s+" and the future day is Saturday");
    }

    }
}

