class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<Integer>();
        for(int i = left ; i <= right ; i ++){
            if(selfDivide(i)){
                l.add(i);
            }
        }
        return l;
    }
    public boolean selfDivide(int n){
        int digit = 0;
        int tempn = n;
        while(true){
            digit = tempn % 10;
            tempn /= 10;
            if(digit == 0)
                return false;
            else{
                if(n % digit == 0){
                    if(tempn == 0)
                        return true;
                    else{
                        continue;
                    }
                }else{
                    return false;
                }
            }
        }
    }
}
