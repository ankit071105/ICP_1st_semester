
class Q3 {
public static void main(String[] args) {
       for (int i = 1; i <= 10; i++) {
        for (int j = 1; j <= 30; j++) {
if (i==1 || j==2) {
    System.out.print("#");
}else if( j==1 || j== 30 || j==29 || i==10){

    System.out.print("#");
}else{
    System.out.print(" ");
}
}        System.out.println();
       }
}
}
