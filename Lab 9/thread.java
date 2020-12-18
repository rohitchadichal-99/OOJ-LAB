import java.util.*;
import java.io.*;
import java.lang.*;
class newthread implements Runnable
{
	Thread t;
	newthread()
	{
		t=new Thread(this,"CSE");
		System.out.println("CHILD THREAD: "  + t);
	}
	public void run()
	{
		try{
            for(;;)
            {
			    System.out.println("CSE");
			    Thread.sleep(2000);
			}
		}catch(InterruptedException e){
			System.out.println("CSE Thread interrruoted ");
		}
		System.out.println("Exiting The CSE Thread");
	}
}

class thread
{
	public static void main(String[] args)
	{
		newthread nt=new newthread();
		nt.t.start();
		try{
			for(;;)
			{
			   System.out.println("BMS COLLEGE OF ENGINEERING");
			   Thread.sleep(10000);
			}
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted: ");
		}
		System.out.println("Exiting out of the main thread ");
	}
}