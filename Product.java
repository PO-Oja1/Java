import java.util.Scanner;

class Product
{
  String pname;
  int pcode, pprice;

  Product()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Product Code: ");
    pcode = Integer.parseInt(sc.nextLine());
    //pcode = sc.nextInt();
    System.out.println("Enter The Product Name: ");
    //sc.skip("[\r\n]+");
    pname = sc.nextLine();
    //pname = sc.next();
    System.out.println("Enter The Product Price: ");
    //sc.skip("[\r\n]+");
    pprice = sc.nextInt();
    
  }
  public static void main(String arg[])
  {
    Product p1 = new Product();
  }
}