public class Fibonacci
{
public static void main(String[] args)
{
	//fibonacci series
long first=0, second=1, series=0;
System.out.print("fibonacci series: " +first+ " " +second+ " ");

for(int i=0;i<=50;i++)
{
series=first+second;
System.out.print(series+ " ");
first=second;
second=series;
}
}
}