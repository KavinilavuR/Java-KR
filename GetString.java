//Question:Get a String variable(like a Name) using Scanner class and print it
import java.util.Scanner;
  public class GetString
  {
    public static void main(String[] args)
    {
      String name;
      Scanner scanner_obj = new Scanner(System.in);
      System.out.print("Enter your Name:");
      name = scanner_obj.nextLine();
      System.out.print("your name is:"+name);
    }
  }

/*
output:
Enter your Name:kavin
your name is:kavin
*/
      
      
