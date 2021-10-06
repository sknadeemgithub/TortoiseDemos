package Array_Assignmnet;

public class LargeSmallNumber {
	public static void main(String args[])
	{
		int arr[]= {33,42,1,3,55,35};
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
			else if(arr[i]<min)
			{
			min=arr[i];
			}
		  System.out.println("Largest number:"+max);
		    System.out.println("Smallest number:"+min);
	}
  
}
