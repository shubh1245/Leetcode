class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] arr = new boolean[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] = true;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (arr[i] == false) {
                result.add(i);
            }
        }
        return result;
    }
}
