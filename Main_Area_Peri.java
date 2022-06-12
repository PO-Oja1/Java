// Main java for Area_peri_math

import java.util.Scanner;
import pratice.Area_peri_math;

public class Main_Area_Peri
{
    public static void main(String args[])
    {
        float area, perimeter;
        float l,b,r,pi=3.14f;
        Scanner sc = new Scanner(System.in);
        Area_peri_math o = new Area_peri_math();
        
        Area_peri_math.rectangle rec = o.new rectangle();
        System.out.println(" ");
        System.out.print("Enter the Length of Rectangle: ");
        l=sc.nextFloat();
        System.out.print("Enter the breadth of Rectangle: ");
        b=sc.nextFloat();
        area = rec.area(l,b);
        perimeter = rec.peri(l,b);
        System.out.println("Area = "+ area +", perimeter = " + perimeter + "\n");

        Area_peri_math.triangle tri=o.new triangle();
        System.out.print("Enter the height of Triangle: ");
        l=sc.nextFloat();
        System.out.print("Enter the base of Triangle: ");
        b=sc.nextFloat();
        area = tri.area(l,b);
        perimeter = tri.peri(l,b);
        System.out.println("Area = " + area + ", perimeter = " + perimeter + "\n");

        Area_peri_math.circle cir=o.new circle();
        System.out.print("Enter the radius of circle: ");
        r=sc.nextFloat();
        area=cir.area(r,pi);
        perimeter = cir.peri(r,pi);
        System.out.println("Area = " + area + ", perimeter = " + perimeter);
    }
}