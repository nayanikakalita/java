import java.util.*;
//returns both the original and the uppercase sequences

public class Uppercase
{
static String[] method(String original)
{
	String[] seq = new String[2];
 seq[0]=original;
 seq[1]=original.toUpperCase();
 return seq;

}
public static void main(String[] args)
{
	
	Scanner myObj=new Scanner(System.in);
	System.out.print("Enter a word:");
	String original= myObj.nextLine();
	String[] seq = method(original);
System.out.println("Original word:" +seq[0]);
System.out.println("uppercase word:" +seq[1]);
}
}
 