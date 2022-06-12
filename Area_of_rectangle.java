import java.util.Scanner;

public class Area_of_rectangle {
    public static void main(String args []) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println(" ");
       System.out.print("Enter the length: ");
       int l=sc.nextInt();
       System.out.print("Enter the breadth: ");
       int b=sc.nextInt();
       System.out.print("Area Of A Rectangle: " + l*b);
    }    
}