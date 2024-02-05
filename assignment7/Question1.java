import java.util.*;
class Question1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Size of Array :");
int n=sc.nextInt();
int r[] = new int[n];
for(int a=0; a<n; a++)
{
      r[a]=(int)(Math.random()*(9-1+1)+1);
}
System.out.println("Values Stored in Array ");
for(int a=0; a<n; a++)
{
      System.out.print(r[a]+" ");
}
double s=0;
for(int a=0; a<n; a++)
{
s=s+r[a];
}
System.out.println();
System.out.println("Sum ="+s);
System.out.println("Average ="+(s/n));
}
}