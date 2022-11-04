//threading allows for concurrency in programs
//multithreading helps us achieve concurrency
//concurrency : managing different computations
//parallelism : running multiple computations

//Thread class
class Mythread1 extends Thread
{
	@Override
	public void run()
	{
		int i=0;
		while(i>40000)
		{
		System.out.println("my thread1 is running");
		System.out.println("i am happy");
		i++;
		}
	}
}
class Mythread2 extends Thread
{
	@Override
	public void run()
	{
		int i=0;
		while(i>40000)
		{
		System.out.println("my thread2 is running");
		System.out.println("i am sad");
		i++;
		}
	}
}
public class Threadingimple {
	
	//creating threads by 2 methods:
	//by implementing thread class
	//by runnable interface

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mythread1 m1=new Mythread1();
		Mythread2 m2=new Mythread2();
		m1.start(); //run method internally called
		m2.start();

	}

}
