import java.util.*;
import java.io.*;
import java.lang.*;
class callme
{
	synchronized void call(String msg)
	{
		System.out.print("[ " + msg);
		try
		{
			Thread.sleep(2000);
		}catch(InterruptedException e)
		{
			System.out.println("Exception Caught");
		}
		System.out.println("]");
	}
}
class caller implements Runnable
{
	String msg;
	callme target;
	Thread t;
	caller(callme targ,String s)
	{
		target=targ;
		msg=s;
		t=new Thread(this,"SYNC");
	}
	public void run()
	{
		target.call(msg);
	}
}
class sync
{
	public static void main(String[]args)
	{
		callme tt=new callme();
		caller ob1=new caller(tt,"Rohit");
		caller ob2=new caller(tt,"Anil");
		caller ob3=new caller(tt,"Chadichal");
		ob1.t.start();
		ob2.t.start();
		ob3.t.start();
		try
		{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();

		}catch(InterruptedException e){
			System.out.println("Exception Caught");
		}
	}
}