package Array_Assignmnet;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargestNumber {
public static void main(String args[])
{
	int arr[]= {20,10,55,35,9,102,113};
	int size=arr.length;
	Arrays.sort(arr);
	int sln=arr[size-2];
	System.out.println("Second large Number is: "+sln);
	
}
}
