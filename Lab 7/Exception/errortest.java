import java.util.*;
import java.io.*;
import java.lang.*;

class Wrongage extends Exception
{
	public int a;
	Wrongage(int x)
	{
		a=x;
	}

	public String toString()
	{
		return "Wrongage[" + a + "]";
	}
}
class father 
{
	public int age;
	father(int a)
	{
		age=a;
	}
	public void check() throws Wrongage
	{
		System.out.println("Checking the age of the father ");
		System.out.println();
		if(age<0)
			throw new Wrongage(age);
		System.out.println("Correct Age");
	}
}

class son extends father
{
	public int son_age;
	son(int fa_age,int i)
	{
		super(fa_age);
		son_age=i;
	}
	public void check() throws Wrongage
	{
		super.check();
		System.out.println();
		System.out.println("Checking the age of the Son ");
		System.out.println();
		if(son_age<0||son_age>age)
			throw new Wrongage(son_age);
		System.out.println("Correct Age");
	}
}
public class errortest
{
	public static void main(String[] args)
	{
		int so_age,father_age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age Of The Father ");
		father_age=sc.nextInt();
		System.out.println("Enter the age of the son ");
		so_age=sc.nextInt();
		son s=new son(father_age,so_age);
		try
		{
			s.check();
		}catch(Wrongage w)
		{
			System.out.println("Exception: " + w);
		}

	}

}