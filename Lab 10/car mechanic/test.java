import java.util.*;
import java.io.*;
import java.lang.*;
class car_queue
{
	boolean valueset=false;
	synchronized String get()
	{
		try
		{
			while(!valueset)
			{
				wait();
			}

		}catch(InterruptedException e){
			System.out.println("Exception Caught");
		}
		System.out.println("Mechanic: Serviced,Thank You!");
		valueset=false;
		notify();
		return "yes";
	}
	synchronized void put(String msg)
	{
		try
		{
			while(valueset)
			{
				wait();
			}
		}catch(InterruptedException e){
			System.out.println("Exception Caught");
		}
		System.out.println(msg);
		valueset=true;
		notify();
	}
}
class car_owner implements Runnable
{
	Thread t;
	car_queue cq;
	car_owner(car_queue cq)
	{
		this.cq=cq;
		t=new Thread(this,"OWNER");
	}
	public void run()
	{
		while(true)
		{
		    cq.put("Owner:Please Service My Car");
		}
	}
}
class car_mechanic implements Runnable
{
	Thread t;
	car_queue cq;
	car_mechanic(car_queue cq)
	{
		this.cq=cq;
		t=new Thread(this,"Mechanic");
	}
	public void run()
	{
		while(true)
		{
			cq.get();
		}
	}
}
class test
{
	public static void main(String[] args)
	{
		car_queue cq=new car_queue();
		car_owner co=new car_owner(cq);
		car_mechanic cm=new car_mechanic(cq);
		co.t.start();
		cm.t.start();
		try{
			co.t.join();
			cm.t.join();
		}catch(InterruptedException e){
			System.out.println("Exception Caught");
		}
	}
}