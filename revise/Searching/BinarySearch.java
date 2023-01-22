public class BinarySearch{
	public static void main(String []args)
	{
		int target = 20;
		int []a = {10,20,30,40,50};

		int s = 0, e = a.length-1;

		while(s <= e)
		{
			int mid = s + (e-s)/2;

			if(a[mid] < target)
			{
				s = mid + 1;
			}
			else if(a[mid] > target)
			{
				e = mid - 1; 
			}
			else
			{
				System.out.println(mid);
				break;
			}
		}
		System.out.println(-1);
	}
}