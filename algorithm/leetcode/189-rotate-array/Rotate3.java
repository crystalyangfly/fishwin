class Rotate3 {

    /**
     *  Loop:
     *  1) tmp = nums[nums.length-1];
     *  2) copy all numbers except the last one to the position next of it. For example, nums[7] = nums[6]
     *  3) nums[0] = tmp
     *  repeat the loop k times
     *  time: O(n*k)
     *  space: O(1)
     */
    public void rotate3(int[] nums, int k) {
        int len = nums.length;
        if(nums==null||nums.length<=1||k<=0||k==len)
            return;
        if(k>len)
            k=k%len;
        int loop=k;
        while (loop>0){
            int tmp=nums[len-1];
            for(int i=len-1;i>0;i--){
                nums[i]=nums[i-1];
            }
            nums[0]=tmp;
            loop--;
        }
    }
}