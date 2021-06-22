import java.util.*;
import java.lang.Math;

//to check whether the given number is a amstrong number

public class Amstrong
{
static boolean amsnum(int num)
{
int a=0, sum=0, last=0, digits=0;
a=num;
while(a>0)
{
a=a/10;
digits++;
}
a=num;
while(a>0)
{
last=a%10; //gives the last digit
sum+=Math.pow(last,digits);
a=a/10; //remove last digit
}
if(num==sum)
return true;
else
return false;
}
public static void main(String[] args)
{
int num;
Scanner myObj= new Scanner(System.in);
System.out.println("Enter a number");
num= myObj.nextInt();
System.out.println("The number is an Amstrong number:" +amsnum(num));
}
}

