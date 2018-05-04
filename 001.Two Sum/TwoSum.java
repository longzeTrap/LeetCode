class Solution {
    public int[] twoSum(int[] nums, int target) {
           int[] result = new int[2];
            Map<Integer, Integer> map = new HashMap<>();
        
        for(int i =0; i<nums.length; ++i)
        {
            if (map.containsKey(target - nums[i]))
            {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
            }
            
            map.put(nums[i], i);
        }
      
      return result;  
    }
}


/*
思路：
给定数组nums[]，以及一个目标值target，nums中有两个元素相加等于target，返回这两个元素的下标。
map中key是元素值，value是元素下标。将所有元素存入map。
target-nums[i]若在map中，则map.get(target-nums[i])求取下标
*/
