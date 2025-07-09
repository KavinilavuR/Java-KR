//Question:check whether the given number is even or odd
//programming lang:java
import java.util.Scanner;
public class checkEO
{
    public static void main(String[] args)
    {
        int java;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some Number:");
        java = sc.nextInt();
        if(java==0)
        {
            System.out.println(java + " is neither even nor odd");
        }
        else if(java%2==0)
        {
            System.out.println(java + " is even");
        }
        else{
            System.out.println(java + " is odd");
        }
    }
}
/* 
output:
Enter some Number:
0
0 is neither even nor odd
*/
