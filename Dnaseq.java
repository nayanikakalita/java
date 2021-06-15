import java.util.*;

public class Dnaseq
{
//a java program to get DNA sequence from user and find its length & check are they same

public static void main (String[] args)
{
int c=0;
Scanner myObj= new Scanner(System.in);
System.out.println("Enter a DNA sequence");
String dna1=myObj.nextLine();
System.out.println("Enter 2nd DNA sequence");
String dna2=myObj.nextLine();
System.out.println("length of first DNA sequence:" + dna1.length());
System.out.println("length of 2nd DNA sequence:" + dna2.length());

if(dna1.length()==dna2.length())
{
for (int i=0; i<dna1.length(); i++)
{
if (dna1.charAt(i)!= dna2.charAt(i))
{
c++;
}
}
if (c>=1)
{
System.out.println("Sequences are not same");
}
else 
{
System.out.println("Sequences are same");}
}

else{
System.out.println("Sequences are not same");}
}
}




