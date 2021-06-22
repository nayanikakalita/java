import java.util.Scanner;

// a simple class and object to print name

class Name
{
public void namemethod(String fname, String lname)
{
 System.out.println("The name is:" +fname+ " " +lname);
 }
 }
 
public class Printname
{
public static void main(String[] args)
{
String fname, lname;
Scanner name= new Scanner(System.in);
System.out.println("Enter the first name:" );
fname=name.nextLine();
System.out.println("Enter the last name:" );
lname=name.nextLine();
Name myObj= new Name();
myObj.namemethod(fname,lname);
}
}