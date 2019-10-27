import javax.swing.*;
import java.util.Scanner;

public class LinkListMain
{
    private static Scanner keyboard = new Scanner(System.in);
    private static int getMenuSelection()
    {
        System.out.println("\n -----------Menu----------");
        System.out.println("1. Insert new student information");
        System.out.println("2. Fetch/Output student information");
        System.out.println("3. Delete student information");
        System.out.println("4. Update student information");
        System.out.println("5. Output all student information");
        System.out.println("6. Exit Program");
        System.out.println("Please enter selection:");
        return keyboard.nextInt();
    }
    public static void main(String[]args)
    {
        int selection;
        HomogenSinglyLinkList linkList = new HomogenSinglyLinkList();
        Listing listing;
        String name;

        System.out.print("Enter the initial number of students: ");
        int n = keyboard.nextInt();
        keyboard.nextLine();

        while(linkList.size()<n)
        {
            listing= new Listing();
            listing.input();
            linkList.insert(listing);
        }
     do
     {
         selection = getMenuSelection();
         switch(selection)
         {
             case 1:
                 listing = new Listing();
                 listing.input();
                 if(linkList.insert(listing))
                     System.out.println("Operation Complete");
                 else
                     System.out.println(listing.getName()+ "is already on the list.");
                 break;

             case 2:
                 name = JOptionPane.showInputDialog("Enter name to fetch");
                 listing = linkList.fetch(name);
                 if(listing == null)
                     System.out.println("not in structure");
                 else
                 {
                     System.out.println(listing.toString());
                     System.out.println("task complete");
                 }
                 break;
             case 3:
             name = JOptionPane.showInputDialog("Enter name to delete");
             if(linkList.delete(name))
                 System.out.println("task complete");
             else
                 System.out.println("not in structure");
             break;
             case 4:
                 listing= new Listing();
                 listing.input();
                 if(linkList.update(listing.getName(),listing))
                     System.out.println("task complete");
                 else
                     System.out.println("not in structure");
                 break;

             case 5:
                 linkList.printAll();
                 System.out.println("task complete");
                 break;
             case 6:
             System.out.println("Thank you");
             break;
             default:
                 System.out.println("Invalid selection: Please try again");
         }

     }while(selection!= 6);
    }
}
