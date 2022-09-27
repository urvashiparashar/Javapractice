//class Pen
//{
//	//properties of pen
//	String color;
//	String type; //ball point / gel
//	
//	//functions
//	public void write()
//	{
//		System.out.println("writing something");
//	}
//	
//	public void printcolor()
//	{
//		System.out.println(this.color); //jo bhi object call kregi uska color
//		//and this represents that particular object
//	}
//	
//}

class Student
{
	//properties
	String name;
	int age;
	
	//functions
	public void printinfo()
	{
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
//	Student()
//	{
//		//non-parameterized constructor
//		System.out.println("constructor called");
//	}
	//by deafult constructor already called
	
	//parameterized constructor
	Student(String name,int age)
	{
		this.name=name;
		this.age=age; 
		//this->object ka member
		//and other is the parameter in constructor
	}
	//copy constructor: ek object me copy krke dusri object me daala
	Student(Student s2)
	{
		this.name=s2.name;
		this.age=s2.age;
	}
}

public class Class_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//objects of pen
//		Pen pen1=new Pen();
//		
//		//defining properties of class pen to its object and assigning
//		pen1.color="blue";
//		pen1.type="gel";
//		pen1.write();
//		pen1.printcolor();
//		
//		Pen pen2=new Pen();
//		pen2.color="Black";
//		pen2.printcolor();
		
		Student s1=new Student("aman",24);
		//new keyboard: ek jagah allocate hojaegi and woh object is allocated in that
		//space.
		//Student(): function- constructors
		//constructors make object
		//non-parameterized: 
		s1.name="aman";
		s1.age=22;
//		s1.printinfo();
		
		Student s2=new Student(s1); //s1 properties assigned to object s2
		s2.printinfo();

	}

}
