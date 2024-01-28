public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Index = m - 1;
        int nums2Index = n - 1;

        for(int index = m+n -1; index >= 0; index--) {
            if(nums1Index < 0) {
                nums1[index] = nums2[nums2Index];
                nums2Index--;
            } else if(nums2Index < 0) {
                nums1[index] = nums1[nums1Index];
                nums1Index--;
            } else if(nums1[nums1Index] <= nums2[nums2Index]) {
                nums1[index] = nums2[nums2Index];
                nums2Index--;
            } else {
                nums1[index] = nums1[nums1Index];
                nums1Index--;
            }
        }
    }
}