import java.util.Scanner;

public class String_search {
    public static void main(String arg[])
    {
        int i, pos=0;
        boolean state = false;
        Scanner sc = new Scanner(System.in);
       
        System.out.println(" ");
        System.out.print("ENTER THE NUMBER OF ELEMENTS IN THE ARRAY: ");
        int limit = sc.nextInt();

        String word[]=new String[limit];
        sc.nextLine();
        for(i=0; i<limit; i++)
        {
            System.out.print("ENTER THE ELEMENT: ");
            word[i]=sc.nextLine();
        }

        System.out.println("ENTER THE ELEMENT TO SEARCH: ");
        String search = sc.nextLine();
        for(i=0; i<limit; i++)
        {
            if(word[i].equals(search))
            {
                pos = i+1;
                state = true;
            }
        }
        if(state)
        {
            System.out.println("Element found at position = " + pos);
        }
        else
        {
            System.out.println("Element not found");
        }
        sc.close();
    } 
}
