
public class Q15 {
   public static void main(String[] args) {

   //    ***+*  WITHOUT TEMP VARIABLE  ***+*     //

    int a =10, b=20, c=30, d=40;
System.out.println("The Value of a before Swap is "+a);
System.out.println("The Value of b before Swap is "+b);
System.out.println("The Value of c before Swap is "+c);
System.out.println("The Value of d before Swap is "+d);
    a = a^b^c^d;
    d = a^b^c^d;
    c = a^b^c^d;
    b = a^b^c^d;
    a = a^b^c^d;
    System.out.println();
    System.out.println("The Value of a after Swap is "+a);
System.out.println("The Value of b after Swap is "+b);
System.out.println("The Value of c after Swap is "+c);
System.out.println("The Value of d after Swap is "+d);
System.out.println();
System.out.println();
   //    ***+*  WITH TEMP VARIABLE  ***+*     //

   System.out.println("The Value of a before Swap is "+a);
   System.out.println("The Value of b before Swap is "+b);
   System.out.println("The Value of c before Swap is "+c);
   System.out.println("The Value of d before Swap is "+d);
    int e =a;
    a=d;
    d=c;
    c=b;
    b=e;
       System.out.println();
       System.out.println("The Value of a after Swap is "+a);
   System.out.println("The Value of b after Swap is "+b);
   System.out.println("The Value of c after Swap is "+c);
   System.out.println("The Value of d after Swap is "+d);


}
}