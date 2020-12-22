import java.util.*;
import java.io.*;
import java.lang.*;
import cie.*;
import see.*;


public class student_end
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		int final_mark;
		System.out.println("Enter the Number of students ");
		n=sc.nextInt();
		internals[] in=new internals[n];
		external[] ex=new external[n];
		internals ob1=new internals();
		external ob2=new external();
		ob2.mar=new int[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of the student " + (i+1));
			in[i]=new internals();
			in[i].read();
			ex[i]=new external();
			ex[i].read();
		}
        System.out.println();
		for(int i=0;i<n;i++)
		{
			System.out.println("*Details Of The Student* " + (i+1));
			System.out.println("USN of the student is " + in[i].usn);
		    System.out.println("Name of the stuednt is " + in[i].name);
		    System.out.println("Semester of the student is " + in[i].sem);
			for(int j=0;j<5;j++)
			{
			   final_mark=in[i].a[j]+((ex[i].b[j])/2);	
			   System.out.println("Final Mark of the student " + (i+1) + " " + " in course " + (j+1) + " " + final_mark);

			}
			System.out.println();
		}

	}

}