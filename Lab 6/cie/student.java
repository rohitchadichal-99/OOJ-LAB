package cie;
import java.util.*;
public class student
{
	public String usn;
	public String name;
	public int sem;

	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the usn of the student ");
		usn=sc.next();
		System.out.println("Enter the name of the student ");
		name=sc.next();
		System.out.println("Enter the semester of the student ");
		sem=sc.nextInt();
	}
}