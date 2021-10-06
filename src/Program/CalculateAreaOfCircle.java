package Program;

import java.util.Scanner;

public class CalculateAreaOfCircle {
public static void main(String args[])
{
	System.out.println("Enter the number");
	Scanner sc= new Scanner(System.in);
	double num=sc.nextDouble();
	double area=(22*num*num*num)/7;
	System.out.println("Area of circle is:"+area);
	
}
}
