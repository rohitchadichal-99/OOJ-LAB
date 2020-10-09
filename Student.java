import java.util.*;

public class Student
{
     String name;
     String USN;
     int marks[]=new int[5];
     int credits[]=new int[5];

         int tot=0;
         int i;
         int grade=0;
    void read_data()
    {
            Scanner obj=new Scanner(System.in);
            System.out.println("ENTER THE NAME OF THE STUDENT:\n");
            name=obj.next();
            System.out.println("ENTER THE USN:\n");
            USN=obj.next();
            System.out.println("ENTER THE CREDITS AND MARKS FOR 5 SUBJECTS:\n");

            for(i=0;i<5;i++)
            {
                System.out.println("CREDITS FOR SUBJECT "+(i+1)+": ");
                credits[i]=obj.nextInt();
                System.out.println("\nMARKS FOR SUBJECT "+(i+1)+": ");
                marks[i]=obj.nextInt();
            }
    }
     void calc_SGPA()
    {
        for(i=0;i<5;i++)
        {
            if(marks[i]>=90 && marks[i]<=100)
                grade = 10;
            else if(marks[i]>=75 && marks[i]<90)
                 grade = 9;
            else if(marks[i]>=60 && marks[i]<75)
                 grade = 8;
            else if(marks[i]>=50 && marks[i]<60)
                 grade = 7;
            else if(marks[i]>=45 && marks[i]<50)
                 grade = 6;
            else if(marks[i]>=40 && marks[i]<45)
                grade = 5;
            else if(marks[i]<40)
                grade = 0;

                tot = tot + grade * credits[i];
        }
        tot = tot/20;
        System.out.println("Total SGPA:" +tot);
    }
     void details()
    {
            System.out.println("NAME:"+name);
            System.out.println("USN:"+USN);
            System.out.println("MARKS and CREDITS OF ALL 5 SUBJECTS:");
            for(i=0;i<5;i++)
            {
                System.out.print(marks[i]+"\t");
                System.out.println(credits[i]);
            }

            calc_SGPA();
        }

    public static void main(String args[])
    {
        Student ob=new Student();
        ob.read_data();
        ob.calc_SGPA();
        ob.details();
    }
}