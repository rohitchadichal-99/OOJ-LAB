package see;
import java.util.*;
import java.io.*;
import java.lang.*;

public class external extends cie.student
{
	public int[] b=new int[5];
	public int[] mar;
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the SEE marks of the course " + (i+1));
			b[i]=sc.nextInt();
		}
	}
}