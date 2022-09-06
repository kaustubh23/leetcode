package leetcode;

public class ZigZag {

	public static void main(String[] args) {
		int nums[] = new int[] { 1,2,3 };

		System.out.println(new ZigZag().movesToMakeZigzag(nums));

	}
	
	   public int movesToMakeZigzag(int[] nums) {
         int count=0;
			for (int i = 0; i < nums.length-1; i++) {

				if (i == 0) {
					if (!(nums[i] < nums[i + 1])) {
						swap(nums, i, i + 1);
						count++;
					}

				}

				if (i == nums.length - 1) {
					if (!(nums[i] > nums[i - 1])) {
						swap(nums, i, i + 1);
						count++;
					}

				}

				if (!(i == 0) && !(i == nums.length - 1)) {
					if(i%2==0) {
						if (!(nums[i] < nums[i - 1])) {
							swap(nums, i, i - 1);
							count++;
						}
						if (!(nums[i] < nums[i + 1])) {
							swap(nums, i, i + 1);
							count++;
						}	
					}else {
						if (!(nums[i] > nums[i - 1])) {
							swap(nums, i, i - 1);
							count++;
						}
						if (!(nums[i] > nums[i + 1])) {
							swap(nums, i, i + 1);
							count++;
						}
					}
					
				}

			}
				    
			return count;
	    }

	public static void swap(int[] nums, int pos1, int pos2) {
		int temp = 0;
		temp = nums[pos2];
		nums[pos2] = nums[pos1];
		nums[pos1] = temp;

	}

}
