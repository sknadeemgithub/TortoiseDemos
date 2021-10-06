package Practice2;

public class Arms {
public static void main(String args[])
{
int num=153;
int n=num;
int rem,sum=0;
while(num>0)
{
	rem=num%10;
	sum=sum+rem*rem*rem;
	num=num/10;
}
if(sum==n)
{
	System.out.println("Number is Armstrong :"+sum);
}
else
{
	System.out.println("Number is not Armstrong:"+sum);
}
}
}

public class Arms{
	
}