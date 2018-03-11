/**
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/

class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length; i++ ){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        
        for(Integer i : set){
            return i;
        }
        return -1;
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        int num = 0;
        for(int i = 0 ; i < nums.length; i++ ){
            num ^= nums[i];
        }
        return num;
    }
}
