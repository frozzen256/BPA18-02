import java.util.Scanner;


public class Solution
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("What is your name? ");
      String name = in.nextLine();

      // display output on console
      System.out.println("Hello, " + name);
   }
}