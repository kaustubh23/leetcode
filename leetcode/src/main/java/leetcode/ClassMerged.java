package leetcode;

import java.util.Arrays;

public class ClassMerged {
	public static void main(String[] args) {
		
		System.out.println(findMedianSortedArrays(new int [] {1,2},new int [] {3,4}));
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int totalSize= nums1.length+nums2.length;
		int num1Size=nums1.length;
		double median =0;
        int [] merged = new int[totalSize];
        int count=0;
        for(int i=0;i<nums1.length;i++) {
        	merged[i]=nums1[i];
        }
       
        
        for(int i=0;i<nums2.length;i++) {
        	merged[num1Size+i]=nums2[i];
        }
        
        Arrays.sort(merged);
        if(merged.length%2==0) {
        median=(double)(merged[totalSize/2]+merged[(totalSize/2)-1])/2;
        }else {
        	median=merged[totalSize/2];
        	
        }
        return median;
        
        
    }

}
