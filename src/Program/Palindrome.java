package Program;

public class Palindrome {
	public static void main(String args[])
	{
		String  name="Nadeem";
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("Name in palindrome:"+rev);
	}

}
