public class Concat
{
public static void main(String[] args)
{
	//concatenate two DNA sequences
String dna1="ATGCCAATATGC";
String dna2="atgccaatatgc";
System.out.println("First seq: " +dna1);
System.out.println("second seq: " +dna2);
System.out.println("Concatenate: " +dna1.concat(dna2));
}
}