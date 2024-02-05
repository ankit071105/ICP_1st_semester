import java.util.*;
class Question8 {
    public static void main(String args[])throws Exception
    {
          int arr[];
          boolean k=true;
          Scanner in = new Scanner(System.in);
          System.out.print("Enter the Value of n :");
          int n=in.nextInt();
          arr = new int[n];
          System.out.println("Enter the element of array");
          for(int a=0; a<n; a++)
          {
            arr[a]=in.nextInt();
          }
           while(k) {
                System.out.println("Choose Your Option :");
                System.out.println("""
                    a. Display the array elements
                    b. Insert an  element at specific position
                    c. Delete an element at a given position
                    d.Exit
                        """);
                        char c=in.next().charAt(0);
             switch(c)
             {
             case 'a':
             for(int a=0; a<arr.length; a++)
             {
                   System.out.println(arr[a]);
             }
             break;
             case 'b':
             System.out.print("Enter the Value to Insert :");
             int i=in.nextInt();
             System.out.print("Enter the position number to Insert:");
             int p=in.nextInt();
            for(int a=arr.length-2; a>=p;a--)
            {
                arr[a+1]=arr[a];
            }
            arr[p]=i;
            System.out.println();
            System.out.println("The New Inserted array is ");
            for(int a=0; a<arr.length; a++)
             {
                   System.out.println(arr[a]);
             }
            break;
             case 'c':
             System.out.print("Enter the Position Number to Delete   :");
             int ps=in.nextInt();
             System.out.println();
             System.out.println(arr[ps]+" at position number"+ps+" deleted");
             for(int a=ps; a<arr.length-1; a++)
          {
            arr[a]=arr[a+1];
          }
      arr[arr.length-1]=0;
      System.out.println("After Delted element of an  array ,  The array is");
      for(int a=0; a<arr.length; a++)
       {
             System.out.println(arr[a]);
       }
      break;
      case 'd':
      k=false;
      break;
default :
      System.out.println("Invalid Option");
}
}
System.out.println("Exiting Program");
    }
}

















       
       