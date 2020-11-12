import java.util.*;
class Book1
{
    String name,author;
    double price;
    int num_pages;

       public Book1()
       {
        this.name="";
        this.author="";
        this.price=0.0;
        this.num_pages=0;
       }

        public void DETAILS()
       {
        Scanner ob=new Scanner(System.in);
        System.out.println("ENTER THE NAME OF THE BOOK\n");
        name=ob.nextLine();
        System.out.println("ENTER THE NAME OF THE AUTHOR");
        author=ob.nextLine();
        System.out.println("ENTER THE PRICE OF THE BOOK");
        price=ob.nextDouble();
        System.out.println("ENTER THE NUMBER OF PAGES OF THE BOOK");
        num_pages=ob.nextInt();
       }

      public void ToString()
     {
      System.out.println("****DETAILS OF THE BOOK****");
      System.out.println("NAME OF THE BOOK:"+name);
      System.out.println("NAME OF THE AUTHOR:"+author);
      System.out.println("PRICE OF THE BOOK:"+price);
      System.out.println("NO. OF PAGES OF THE BOOK:"+num_pages);
     }
      public static void main(String args[])
      {
        int i=0,n;
        Book1 obj=new Book1();
        Scanner ob1=new Scanner(System.in);
        System.out.println("ENTER THE LIMIT");
        n=ob1.nextInt();
        for(i=1;i<=n;i++)
        {
          obj.DETAILS();
          obj.ToString();
        }
      }
 }