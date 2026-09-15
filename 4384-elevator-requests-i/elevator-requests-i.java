class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int s = requests.length;
        int sum = requests[0];
        for(int i = 1; i < s; i++){
            sum = sum + Math.abs(requests[i] - requests[i - 1]);
        }
        return sum;
    }
}