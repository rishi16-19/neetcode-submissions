class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer,Integer> count = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(count.containsKey(target-nums[i])){
                ans[0]=count.get(target-nums[i]);
                ans[1]=i;
            }
            else{
                count.put(nums[i],i);
            }
        }

        return ans;
    }
}
