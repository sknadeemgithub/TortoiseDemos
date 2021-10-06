package Program;

public class FactorialNumber {
public static void main(String args[])
{
 int i=1, fact=1;
 int num=15;
 for(i=1;i<=num;i++)
 {
	 fact=fact*i;
	 System.out.println("factorial of number is:"+fact);
 }
}
}