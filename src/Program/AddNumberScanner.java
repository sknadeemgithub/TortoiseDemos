package Program;
import java.util.Scanner;

public class AddNumberScanner {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second numbeer:");
		int num2=sc.nextInt();
		int num3=num1+num2;
		System.out.println("Total number:"+num3);
		
	}

}
