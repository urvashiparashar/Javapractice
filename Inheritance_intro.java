import java.util.*;  //util is package in java with various class and methods

import bank.*;

////********INHERITANCE (start)*********************************
class Shape  //base/parent class
{
//	String color;
	public void area() {
	   System.out.println("displays area");
	}
	
}
//1. single level inheritance : only one parent and one subclass
class Triangle extends Shape  //subclass/child class
{ 
	public void area(int l,int h)
	{
		System.out.println(1/2*l*h);
	}
}
//2. multi level inheritance : one after the other inheriting order
class Equilateral extends Triangle
{
	public void area(int l,int h)
	{
		System.out.println(1/2*l*h);
	}
}

//3. heirarchical inheritance: one base class : different subclass
class Circle extends Shape
{
	public void area(int r)
	{
		System.out.println((3.14)*r*r);
	}
}
//4. hybrid inheritance : one or more forms of inheritance
//5. multiple inheritance: only used for interfaces in java


///********INHERITANCE (end)*********************************
public class Inheritance_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object of triangle
//		Triangle t1=new Triangle();
//		t1.color="red"; //color inherited by triangle from shape
		//properties inherited from parent to child is called inheritance
		//reuseability
		
		//package ****************
		bank.Bank_package ba=new bank.Bank_package();
		ba.name="account 1";
		

	}

}
