class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        boolean re = false;
        for(int i = 0 ; i < bits.length ; ){
            if(bits[i] == 0){
                re = true;
                i ++;
            }else{
                re = false;
                i += 2;
            }
        } 
        return re;
    }
}
