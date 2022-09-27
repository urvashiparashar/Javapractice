//interface Animal1
//{
//	int eyes=2; //public,static,final by default;
//    void walk(); //be default abstract
////	Animal(); //error as interfaces cannot have constructor
////	void eat()
////	{
////		 //no non abstract functions implementation
////	}
//}
//interface Herbivore
//{
//	
//}
//class Horse1 implements Animal1,Herbivore //multiple inheritance in java
//{
//	//interfaces uses implements
//	public void walk() //error if we not write public because it will be default type then
//	{
//		System.out.println("walks on 4 legs");
//	}
//}

class Student2
{
	String name;
	static String sch_name; //as it will be same for all objects of Student class so that it becomes common for all
    public static void changeschool()
    {
    	sch_name="new school";
    }
}
public class Interfaces_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student2.sch_name="ABC";
		Student2 s2=new Student2();
		s2.name="tony";
		System.out.println(Student2.sch_name);

	}

}
