package Practice_Zaid;

public class Factorial {
	public static void main(String args[])
	{

		int i=1, factorial=1;
		int number=7;

		for(i=1;i<=number;i++)
		{
			factorial=factorial*i;
			System.out.println("factorial of number:"+i+"="+factorial);
		}
		
	}

}
