//question:cube and Square of a Number using class(methods) and objects(obj) concept
//lang : java
import java.util.Scanner;
class methods
{
	private int value;
	/*
	 * if the member variable(value) of the class "methods" would have not been 
	 * under a private access specifier it can be accessed or initialized inside the main class itself
	 * but as it is under a private access specifier there is a need of getter and a setter
	 */
	public void setter(int num) 
	{
		this.value=num;
	}
	public int Cube() //Cube getter
	{
		return value*value*value;
	}
	public int Square() //square getter
	{
		return value*value;  
	}
}

//not allowed to initialize any value inside a class
public class cubeSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		methods obj = new methods();
		System.out.print("Enter a Number:");
		num = sc.nextInt();
		obj.setter(num);
		System.out.println("Cube of 3 :"+obj.Cube());
		System.out.println("Square of 3 :"+obj.Square());

	}

}
/*
output:
Enter a Number:89
Cube of 3 :704969
Square of 3 :7921
*/
