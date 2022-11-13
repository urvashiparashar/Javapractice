class MyThreadRunnable1 implements Runnable
{
	public void run()
	{
		System.out.println("thread 1");
	}
}
class MyThreadRunnable2 implements Runnable
{
	public void run()
	{
		System.out.println("thread 2");
		System.out.println("thread 2");
		System.out.println("thread 2");
		System.out.println("thread 2");
		System.out.println("thread 2");
	}
}

public class Thread_usingRunnableinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating objects
		MyThreadRunnable1 m1=new MyThreadRunnable1();
		MyThreadRunnable2 m2=new MyThreadRunnable2();
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		t1.start();
		t2.start();

	}

}
