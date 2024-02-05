import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
int firstSum = 0, secondSum = 0;   
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the first number: ");  
int x = sc.nextInt();  
System.out.print("Enter the second number: ");  
int y = sc.nextInt();  
for(int i=1;i<x;i++)  
{  
if(x % i == 0)  
{  
firstSum = firstSum + i;  
}  
}  
for(int i=1;i<y;i++)  
{     
if(y % i == 0)  
{  
secondSum = secondSum + i;  
}  
}  
if((x == secondSum) && (y == firstSum))  
{  
System.out.println(x+", "+ y +" are amicable numbers.");  
}  
else  
{  
System.out.println(x+", "+ y +" are not amicable numbers.");  
}
    } 
}
