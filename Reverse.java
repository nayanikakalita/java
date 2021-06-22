import java.util.*;

//a method with a name (string) and prints it in reverse

public class Reverse
{
static void method(String name)
{
int j=name.length();
String rev=" ";
for (int i=j-1;i>=0;i--)
{
rev=rev+name.charAt(i);
}
System.out.print("The name in reverse is:" +rev);
}
public static void main(String[] args)
{
	Scanner myObj=new Scanner(System.in);
	System.out.print("Enter your name:");
	String name= myObj.nextLine();
method(name);
}
}
