class Rotate1 {

    /**
     *  1) reverse all numbers
     *  2) reverse left K numbers
     *  3) reverse right n-k numbers
     *  time: O(n)
     *  space: O(1)
     */
    public void rotate(int[] nums, int k) {
        if(nums==null || nums.length<=1 || k==nums.length ||k<=0)
            return;
        if(k>nums.length){
            k=k%nums.length;
        }
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    void reverse(int[] nums, int start, int end){
        int tmp;
        while(start<end){
            tmp=nums[start];
            nums[start]=nums[end];
            nums[end]=tmp;
            start++;
            end--;
        }
    }
}