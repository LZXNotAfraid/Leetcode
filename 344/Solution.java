class Solution {
    public void reverseString(char[] s) {
        //5  0, 1
        //6  0, 1, 2
        //char r = ' ';
        for(int i = 0 ; i < s.length / 2 ; i ++){
            //r = s[i];
            //s[i] = s[s.length - 1 - i];
            //s[s.length - 1 - i] = r;
            s[i] = (char)(s[i] + s[s.length - 1 - i]);
            s[s.length - 1 - i] = (char)(s[i] - s[s.length - 1 - i]);
            s[i] = (char)(s[i] - s[s.length - 1 - i]);
        }
    }
}
