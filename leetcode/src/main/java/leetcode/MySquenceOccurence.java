package leetcode;

public class MySquenceOccurence {

	public static void main(String args[]) {
		
		int arr[] = { 1, 2, 2, 3, 3, 3, 3 };

		// Element to be counted in arr[]
		int x = 2;
		int n = arr.length;
		int c = count(arr, x, n);
		System.out.println(x + " occurs " + c + " times");
	}

	public static int count(int[] array, int x, int size) {

		int pos1 = 0;
		int post2 = size - 1;
		//int first = first(array, pos1, post2, x, size);
	//	System.out.println("first " + first);
		int first2 = getFirstPosition(array, pos1, post2, x, size);
		System.out.println("first " + first2);
		return 0;

	}

//		int arr[] = { 1, 2, 2, 3, 3, 3, 3 };

	 static int getFirstPosition(int array[], int low, int high, int x, int n) {

		if (high >= low) {
			int mid = (low + high) / 2;

			if ((mid == 0 || x > array[mid - 1]) && array[mid] == x)
				return mid;
			else if (x > array[mid])
			return mid+	getFirstPosition(array, (mid + 1), high, x,n);
			else
			return mid+	getFirstPosition(array, low, (mid - 1), x, n);

		}

		return -1;
	}

	static int first(int arr[], int low, int high, int x, int n) {
		if (high >= low) {
			/* low + (high - low)/2; */
			int mid = (low + high) / 2;
			if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x)
				return mid;
			else if (x > arr[mid])
				return first(arr, (mid + 1), high, x, n);
			else
				return first(arr, low, (mid - 1), x, n);
		}
		return -1;
	}
}
