2104. Sum of Subarray Ranges
class Solution {
    public long subArrayRanges(int[] nums) {
        long res=0;
        int mn,mx;
       for(int i=0;i<nums.length;i++){
            int j=i;
            mn=nums[i];
            mx=nums[i];
            while(j<nums.length){
                mn=Math.min(mn,nums[j]);
                mx=Math.max(mx,nums[j]);
                res+=mx-mn;
                j++;
            }
            
        }
        return res;
    }
}