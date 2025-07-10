//question:cube and Square of a Number using class(methods) and objects(obj) concept
//lang : java
import java.util.Scanner;
class methods
{
	private int value;
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
public class cubeSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		methods obj = new methods();
		num = sc.nextInt();
		obj.setter(num);
		System.out.println("Cube of 3 :"+obj.Cube());
		System.out.println("Square of 3 :"+obj.Square());

	}

}
/*
output:
89
Cube of 3 :704969
Square of 3 :7921
*/
