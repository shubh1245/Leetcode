class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> alpha = new HashSet<>();
        for(int i = 0; i < sentence.length(); i++){
            alpha.add(sentence.charAt(i));
        }
        return alpha.size() == 26;
    }
}