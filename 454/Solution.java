class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> m = new HashMap();
        Map<Integer, Integer> n = new HashMap();
        int len = A.length;
        for(int i = 0 ; i < len ; i ++){
            for(int j = 0 ; j < len ; j ++){
                int t = A[i] + B[j];
                if(m.containsKey(t))
                    m.put(t, m.get(t) + 1);
                else
                    m.put(t, 1);
                int k = C[i] + D[j];
                if(n.containsKey(k))
                    n.put(k, n.get(k) + 1);
                else
                    n.put(k, 1);
            }
        }
        int re = 0;;
        Iterator iter = m.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry entry = (Map.Entry) iter.next();
            int k = (int) entry.getKey();
            int v = (int) entry.getValue();
            if(n.containsKey(k * (-1))){
                re += (v * n.get(k * (-1)));
            }
        }
        return re;
    }
}