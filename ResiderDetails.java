//Question:get Resider Name,Resider age,Residing city,Residing state,Residing country and print it
import java.util.Scanner;
public class ResiderDetails
  {
    public static void main(String[] args)
    {
     String resider_name,street_name,city_name,state_name,country_name;
     int R_age;
     Scanner obj = new Scanner(System.in);
     System.out.println("Enter the Resider Name:");
     resider_name=obj.nextLine(); //string
     System.out.println("Enter the Street Name:");
     street_name=obj.nextLine(); //string
     System.out.println("Enter the city Name:");
     city_name=obj.nextLine();//string(a line)
     System.out.println("Enter the State Name:");
     state_name=obj.nextLine();//string(a line)
     System.out.println("Enter the Country Name:");
     country_name=obj.nextLine();
     System.out.println("Enter the Resider Age:");
     R_age=obj.nextInt();//int
     System.out.println("Resider Name:"+resider_name);
     System.out.println("Street Name:"+street_name);
     System.out.println("city Name:"+city_name);
     System.out.println("State Name:"+state_name);
     System.out.println("Country Name:"+country_name);
     System.out.println("Resider Age:"+R_age);

    }
}

/*
output:
Enter the Resider Name:
kavin
Enter the Street Name:
raja street
Enter the city Name:
tanjo     th hiruvarur
Enter the State Name:
tamilnadu
Enter the Country Name:
india
Enter the Resider Age:
78
Resider Name:kavin
Street Name:raja street
city Name:thiruvarur
State Name:tamilnadu
Country Name:india
Resider Age:78
*/
