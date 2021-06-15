public class Avg
{
	//to find the average of 10 elements
public static void main(String args[])
{
double add=0, avg=0;
double[] elements={34.4, 23, 36.5, 40, 56.4, 2, 3.4, 10.2, 40, 23.5};
for (int i=0; i<elements.length; i++)
{
add=add+elements[i];
}
avg=add/elements.length;
System.out.println("The average of the elements:" +avg);
}
}

