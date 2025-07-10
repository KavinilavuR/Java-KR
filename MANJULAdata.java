/*
question:define a class named person with the attributes name and age,the name is string and the age is integer,then implement the getter methods 
getname() and getage() to retrieve the values of the attributes.create a method display to print the name and age of a person.create instance of the 
class person
*/
class person
{
	private String name;
	private int age;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
	    this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public void display()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
		//can a method inside a class can access another method in the same class under public,private,protected access specifier
	}
	
}
public class MANJULAdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person obj = new person();
		obj.setName("Manjula");
		obj.setAge(97);
		String Nam = obj.getName();
		int Aga = obj.getAge();
		System.out.println("given Name:"+Nam);
		System.out.println("given Age:"+Aga);
		obj.display();
  
	}

}
/*
OUTPUT:
given Name:Manjula
given Age:97
Name:Manjula
Age:97
*/
