class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int k = piles[0];

        for(int i : piles){
            if(i>k){
                k=i;
            }
        }
        
        int l = 1, r = k, min = k;
        while(l<=r){
            int m = l + (r-l)/2;
            int t = 0;
            for(int i : piles){
                t = t + i/m;
                if(i%m>0){
                    t = t + 1;
                }
            }
            if(t<=h){
                min = m;
                r = m - 1;
            }else{
                l = m + 1;
            }
        }
        return min;
    }
}
