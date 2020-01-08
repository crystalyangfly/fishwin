class Rotate2 {

    /**
     *  1) create an array whose length is K
     *  2) copy right k numbers from original array to the new array
     *  3) copy left n-k numners to the end of array
     *  4) copy all k numbers from new array to the left k of original array
     *  time: O(n)
     *  space: O(k)
     */
    public void rotate2(int[] nums, int k) {
        if(nums==null||nums.length<=1||k<=0||k==nums.length)
            return;
        int len = nums.length;
        if(k>len)
            k=k%len;
        int[] subString = new int[k];
        for(int i=0;i<k;i++){
            subString[i]=nums[len-(k-i)];
        }
        int index = len-1;
        int loop =  len-k;
        while (loop>0){
            nums[index]=nums[index-k];
            index--;
            loop--;
        }
        for(int i=0;i<k;i++){
            nums[i]=subString[i];
        }
    }
}