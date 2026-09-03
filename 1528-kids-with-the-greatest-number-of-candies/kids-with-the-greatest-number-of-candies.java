class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int largest = candies[0];
    for(int i = 1; i < candies.length; i++){
        if(candies[i] > largest){
            largest = candies[i];
        }
    }
    ArrayList <Boolean> list = new ArrayList<>(candies.length);

    for(int i = 0; i < candies.length; i++){
        list.add(candies[i] + extraCandies >= largest);
    }
    return list;
    }
};
