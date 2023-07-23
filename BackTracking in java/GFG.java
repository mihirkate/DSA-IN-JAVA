// java program to get total XOR
// of all subarray xors
public class GFG {
		
	// Returns XOR of all subarray xors
	static int getTotalXorOfSubarrayXors(
						int arr[], int N)
	{
	 int m=N;

		// initialize result by
		// 0 as (a xor 0 = a)
		int res1 = 0;
		
		// select the starting element
		for (int i = 0; i < m; i++)
		
			// select the eNding element
			for (int j = i; j <m; j++)
		
			// Do XOR of elements
			// in current subarray
			for (int k = i; k <= j; k++)
				res1 = res1 ^ arr[k];
	
		return res1;
	}
	
	// Driver code
	public static void main(String args[])
	{
		int arr[] = {3, 5, 2, 4, 6};
		
		
		System.out.println(
			getTotalXorOfSubarrayXors(arr, arr.length));
	}
}

// This code is contributed by Sam007.
