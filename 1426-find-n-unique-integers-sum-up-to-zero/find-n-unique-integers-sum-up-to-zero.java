class Solution {
    public int[] sumZero(int n) {
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = 2 * i - n + 1;
        }
        return array;
    }
}