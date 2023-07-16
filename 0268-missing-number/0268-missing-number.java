class Solution {
    public int missingNumber(int[] nums) {
       int n = nums.length;
       int expectedSum  = n*(n+1)/2;
       int sumGot =0;
        for(int i =0;i<n;i++){
            sumGot = sumGot +nums[i];
        }
        return expectedSum -sumGot;
}
}