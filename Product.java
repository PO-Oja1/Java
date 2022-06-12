import java.util.Scanner;

public class Product {

    int pcode,pprice;
    String pname;

    public void read()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n");
        System.out.print("ENTER THE PRODUCT CODE: ");
        pcode = sc.nextInt();
        System.out.print("ENTER THE PRODUCT NAME: ");
        pname = sc.next();
        System.out.print("ENTER THE PRODUCT PRICE: ");
        pprice = sc.nextInt();
    }

    public void display()
    {  
        System.out.println("Product Code: " + pcode);
        System.out.println("Product Name: " + pname);
        System.out.println("Product Price: " + pprice);
    }
    public static void main(String arg[])
    {
        Product p1 = new Product();
        p1.read();
        p1.display();

        Product p2 = new Product();
        p2.read();
        p2.display();

        Product p3 = new Product();
        p3.read();
        p3.display();

        if(p1.pprice <= p2.pprice && p1.pprice < p3.pprice)
        {
            System.out.print("\n");
            System.out.println("Lowest Price Product Code Is " + p1.pcode);
            System.out.println("Lowest Price Product Name Is " + p1.pname);
            System.out.println("Lowest Price Poduct Price Is " + p1.pprice);
        }
        else if(p2.pprice <= p1.pprice && p2.pprice < p3.pprice)
        {
            System.out.print("\n");
            System.out.println("Lowest Price Product Code Is " + p2.pcode);
            System.out.println("Lowest Price Product Name Is " + p2.pname);
            System.out.println("Lowest Price Poduct Price Is " + p2.pprice);
        }
        else
        {
            System.out.print("\n");
            System.out.println("Lowest Price Product Code Is " + p3.pcode);
            System.out.println("Lowest Price Product Name Is " + p3.pname);
            System.out.println("Lowest Price Poduct Price Is " + p3.pprice);
        }
    }
}
