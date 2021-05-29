public class Aminoacid
{
public static void main(String[] args)
{
	//printing amino acids and its molecular weight
String[] amino= {"Ala","Arg","Cys","Glu","Gln","His"};
double[] molwt= {89.1,174.2,121.2,147.1,146.2,155.2};
for (int i=0; i<amino.length; i++)
{
System.out.println(amino[i]+ " mol.wt is: " +molwt[i]);
}
}
}

