package Program;
	
import java.util.Scanner;
public class PositiveNegative {
public static void main(String args[])
{
	System.out.println("Enter the number:");
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
	if(num>0)
	{
		System.out.println("Number is positive:"+num);
	}
	else if(num<0)
	{
		System.out.println("Number is negative:"+num);
	}
	else if(num==0)
	{
		System.out.println("Number is zero:"+num);
	}
	
}
}
