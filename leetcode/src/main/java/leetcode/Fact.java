package leetcode;

public class Fact {

	public static void main(String[] args) {

		int array[] = new int[] { 1, 2 , 3, 3, 3, 4, 7, 8, 8 };
		
		//System.out.println(position(array, 2));
		
		
		
		

		
	}
	
	

	public static int position(int[] arr,int post1,int pos2, int x) {

		int mid = (post1+pos2)/2;
		
		if (arr.length < 1) {
			return -1;
		}
		if(arr[mid] == x) {
			
		}
		
		
		int size = arr.length - 1;
		int mida = size / 2;
		if (arr.length < 1) {
			return -1;
		}

		if (arr[mid] == x) {

			return mid;
		} else {

			if (arr[mid] > x) {
				int left = mid;
				while (left > 0) {
					if (arr[left] == x) {
						return left;
					}
					left=left-1;
				}

			} else {
				int right = mid;
				while (right > size) {
					if (arr[right] == x) {
						return right;
					}
					right=right+1;
				}

			}
		}

		return -1;

	}

	public static int fact(int num) {

		if (num == 0 || num == 1) {
			return 1;
		}

		return num * fact(num - 1);

	}
}
