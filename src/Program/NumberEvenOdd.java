package Program;
import java.util.Scanner;
public class NumberEvenOdd {
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number :");
	int num1=sc.nextInt();
	if(num1%2==0)
	{
		System.out.println("Number is even:"+num1);
	}
	else
	{
		System.err.println("Number is odd:"+num1);
	}
}
}
