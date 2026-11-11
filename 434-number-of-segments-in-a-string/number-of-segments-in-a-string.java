class Solution {
    public int countSegments(String s) {
        if (s.length() < 1){
            return 0;
        }
        int segment = 0;
        int space = 0;
        for(int i = 0; i < s.length(); i++){
            if(space == 0 && s.charAt(i) != ' '){
                space = 1;
                segment++;
            }
            if(space == 1 && s.charAt(i) == ' '){
                space = 0;
            }
        }
        return segment;
    }
}