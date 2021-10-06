package Program;

public class Armstrong_Practice {
public static void main(String args[])
{
	int num=153,rem;
	int sum=0;
	int n=num;
	while(num>0)
	{
		rem=num%10;
		sum=sum+rem*rem*rem;
		num=num/10;
	}
	if(sum==n)
	{
		System.out.println(n+" is an armstrong");
	}
	else
	{
		System.out.println(n+" is not an armstrong");
	}
}
}
