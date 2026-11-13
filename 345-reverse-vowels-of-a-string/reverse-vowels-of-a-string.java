class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder(s);
        int i = 0;
        int j  = n-1;
        while(i<j) {
            char ch = s.charAt(i);
            char it = s.charAt(j);
     if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'|| ch == 'I' || ch == 'O' || ch == 'U') && (it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' || it == 'A' || it == 'E' || it == 'I' || it == 'O' || it == 'U')) {
        char temp = ans.charAt(i);
           ans.setCharAt(i,ans.charAt(j));
           ans.setCharAt(j,temp);
           i++;
           j--;
     } 
     else if(!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch== 'A' || ch == 'E'|| ch == 'I' || ch == 'O' || ch == 'U')) {
        i++;
     } else {
        j--;
     }
        }
        return ans.toString();
    }
}