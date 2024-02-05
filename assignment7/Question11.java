import java.util.*;
class Question11
{
public static void main(String args[])
{
      Scanner in = new Scanner(System.in);
      System.out.println("Enter 10 numbers :");
      int arr[] = new int[10];
      for(int a=0; a<10; a++)
     {
            arr[a]=in.nextInt();
      }
      System.out.println("After Sorting :");
      int b[]=bubbleSort(arr);
      for(int a=0; a<10; a++)
      {
            System.out.println(b[a]);
}
}
public static int[] bubbleSort(int a[])
{
    int t =0;
        for ( int i =1; i <= 9;i++) 
        {
            for (int j =0; j<=8;j ++) 
            {
                 if (a[j] > a[j+1]) 
                 {
                     t= a[j];
                     a[j] =a [j + 1];
                     a[j+1] =t ;
                 }
            }
        }
return a;
}
}