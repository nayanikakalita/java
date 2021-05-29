public class Subjects
{
public static void main(String[] args)
{
	//to calculate %of 5 subjects and declaring pass if more that 50%
float per;
int total=0;
String[] sub={"maths","science","english","EVS","Computer"};
System.out.print("Subjects are: ");
for(int i=0;i<sub.length;i++)
{
System.out.print(sub[i]+ " ");
}
int[] marks={78,86,67,45,80};
System.out.print("\nMarks are: ");
for(int i=0;i<marks.length;i++)
{
System.out.print(marks[i]+ " ");
}
for(int i=0;i<marks.length;i++)
{
total=total+marks[i];
}
System.out.println("\nTotal marks obtained= " +total);
per=(total*100)/500;
System.out.println("Percentage= " +per);
if (per>50)
System.out.println("PASS");
else
System.out.println("FAIL");
}
}

