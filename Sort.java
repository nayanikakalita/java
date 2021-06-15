import java.util.*;

public class Sort
{

//to sort amino acid into albhabetical order

public static void main(String[] args)
{
String[] aminoacid={"glycine", "alanine", "valine", "cysteine", "proline", "leucine" ,"isoleucine", "methionine", "tryptophan", "phenylalanine"};
System.out.println("Amino acid without sorting:");
for (int i=0; i<aminoacid.length; i++)
{	
System.out.print(aminoacid[i] + " ");
}

Arrays.sort(aminoacid);
System.out.println("\nAmino acid in alphabetical order:");
for (int i=0; i<aminoacid.length; i++)
{
System.out.print(aminoacid[i] + " ");
}
}
}
