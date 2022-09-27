class Student1
{
	//properties
	String name;
	int age;
	
	//functions
	//overloading: compile time: checks for correct implementation
	//convention: overloaded func should have diff return type
	//overloaded func should have diff type of arguments
	//overloaded func should have diff no.of arguments
	//compile time polymorphism better than run time polymorphism
	
	public void printinfo(String name)
	{
		System.out.println(name);
	}
	public void printinfo(int age)
	{
		System.out.println(age);
	}
	public void printinfo(String name,int age)
	{
		System.out.println(name+" "+age);
	}
	
	
}

public class Polymorphism_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 s1=new Student1();
		s1.name="aman";
		s1.age=22;
        s1.printinfo(s1.name);
        s1.printinfo(s1.age);
        s1.printinfo(s1.name, s1.age);
        


	}

}
