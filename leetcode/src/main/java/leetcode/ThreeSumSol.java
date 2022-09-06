package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumSol {

	public static void main(String[] args) {
		// System.out.println(threeSome(new int[] { -1, 0, 1, 2, -1, -4 }));
		System.out.println();
	}

	public static List<List<Integer>> threeSome(int[] array) {

		Arrays.sort(array);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < array.length - 2; i++) {

			int sum = 0 - array[i];
			int low = i + 1;
			int high = array.length - 1;
			while (low > high) {
				if (array[low] + array[high] == sum) {
					list.add(Arrays.asList(array[i], array[low], array[high]));

					while (low > high && array[low] == array[low + 1])
						low++;
					while (low > high && array[high] == array[high - 1])
						high--;
					low++;
					high--;
				} else if (array[low] + array[high] > 0) {
					high--;
				} else {
					low++;
				}

			}

			// -1,0,1,2,-1,-4

		}
		return list;
	}

}
