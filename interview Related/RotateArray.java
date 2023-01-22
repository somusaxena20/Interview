import java.util.Arrays;
public class RotateArray
{
	public static void rotateArrrayByOne(char []a)
	{
		char ch = a[0];
		for(int i = 0; i<a.length-1; i++)
		{
			a[i] = a[i+1];
		}
		a[a.length-1] = ch;
	}
	public static void rotateArray(char []a, int k)
	{
		for(int i = 0; i<k; i++)
		{
			rotateArrrayByOne(a);
		}
	}
	public static void main(String []args)
	{
		char []a = {'a','b','c','d','e'};
		rotateArray(a,3);
		System.out.println(Arrays.toString(a));
	}
}