class Solution2 {
    /**
     * time: O(m+n)
     * space: O(m+n)
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || m <= 0 || nums1.length == 0) {
            for(int k = 0; k < m + n; k++) {
                nums1[k] = nums2[k];
            }
            return;
        }
        if (nums2 ==  null || n <= 0 || nums1.length == 0)
            return;
        int[] list = new int[m + n];
        int i = 0, j =0, k = 0;
        while(i < m && j < n) {
            if(nums1[i] <= nums2[j]) {
                list[k] = nums1[i++];
            }else {
                list[k] = nums2[j++];
            }
            k++;
        }
        while (i < m)
            list[k++] = nums1[i++];
        while (j < n)
            list[k++] = nums2[j++];

        nums1 = list;

        for(int l = 0; l < m + n; l++) {
            nums1[l] = list[l];
        }
    }

}