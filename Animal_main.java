
abstract class Animal //to hide
{
	abstract void walk(); //no implementation given to abstract functions
	Animal() {
		System.out.println("an animal constructor");
	}
	public void eats()
	{
		System.out.println("animal eats");
	}
}
class Horse extends Animal
{
	Horse()
	{
		System.out.println("an horse constructor");
		//on printing the subclass constructor first we will get base class constructor then subclass constructor
	    //this concept is called chaining of constructors
	}
	//pure abstraction hides all unused info : in java we use interface
	public void walk()
	{
	   System.out.println("walks on 4 legs");	
	}
}
class Chicken extends Animal
{
	public void walk()
	{
	   System.out.println("walks on 2 legs");	
	}
}
public class Animal_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//no need to call object of Animal class : so abstraction 
		Horse h=new Horse();
		h.walk();
		h.eats(); //as horse inherits the eats func of animal class
//		Animal animal=new Animal(); //error as animal is abstract class
//		animal.walk();

	}

}
