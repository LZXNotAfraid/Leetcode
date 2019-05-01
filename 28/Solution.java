class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0)
            return 0;
        else{
            if(needle.length() > haystack.length())
                return -1;
            else{
                int needlelen = needle.length();
                for(int i = 0 ; i <= haystack.length() - needlelen ; i ++){
                    if(haystack.charAt(i) == needle.charAt(0)){
                        if(compare(haystack, i, needle))
                            return i;
                    }
                }
                return -1;
            }
        }
    }
    public boolean compare(String a, int c, String b){
        for(int i = 0 ; i < b.length() ; i ++){
            if(a.charAt(i + c) != b.charAt(i))
                return false;
        }
        return true;
    }
}