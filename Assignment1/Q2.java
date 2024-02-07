
public class Q2 {
    public static void main(String[] args) {
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 30; j++) {
            if((i==1 && j==1)  || (i==1 && j==2) || (i==1 && j==3) || (i==1 && j==4) || (i==1 && j==5) || (i==1 && j==6) || (i==2 && j==6)  || (i==2 && j==17)|| (i==2 && j==12))  {
                System.out.print("*");
            }else if( (i==3 && j==6)|| (i==3 && j==7) || (i==3 && j==8) || (i==3 && j==9) || (i==3 && j==10) || (i==3 && j==11) ||  (i==3 && j==12)){
                System.out.print("*");
            }else if( (i==1 && j==12) || (i==1 && j==13) || (i==1 && j==14) || (i==1 && j==15) || (i==1 && j==16) || (i==1 && j==17)){
                System.out.print("*"); 
            }else if( (i==3 && j==17) || (i==3 && j==18) || (i==3 && j==19) || (i==3 && j==20) || (i==3 && j==21)|| (i==3 && j==22)){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            }System.out.println();
        }
    }
}
