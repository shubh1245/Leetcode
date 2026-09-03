class Solution {
    public boolean uniformArray(int[] nums1) {
       int smallestOdd = Integer.MAX_VALUE;
       for(int i = 0; i < nums1.length; i++){
        if(nums1[i] < smallestOdd && nums1[i] % 2 != 0){
            smallestOdd = nums1[i];
        }
       }

       if(smallestOdd == Integer.MAX_VALUE){
        return true;
       }

       for(int i = 0; i < nums1.length; i++){
       int nums = nums1[i];
       if(nums % 2 == 0 && nums < smallestOdd){
        return false;
       }
       }
    return true;
    }
}