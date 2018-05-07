class Solution {
    public int searchInsert(int[] nums, int target) {
          
        int len = nums.length - 1;
        int position = 0;
		while( len >= 0 )
        {
		  if( target > nums[len] )
		  	{
			position = len + 1;
			break;
			}
		  else if( target == nums[len] )
		  	{
			position = len;
			}
            
          len--;
		}
        
        return position;
        
    }
}

better
class Solution {
    public int searchInsert(int[] nums, int target) {
        
		for(int i=0;i<nums.length;i++)
		{
			if(target<=nums[i])
				return i;
		}
			return nums.length;
    }
}




/*
题目；给定一个已排序的数组，以及一个目标值，若要把目标值按排序插入，找出目标值位置。
例如： Input: [1,3,5,6], 5     Output: 2
	     Input: [1,3,5,6], 2     Output: 1

思路：
s1:设两个变量，一个用于循环len，一个用于记录位置position
s2:循环从数组末尾向前开始，因为数组本就是有序数组
s3:当target大于等于数组元素时，记录位置

notes:若是大于则记录数组元素位置加1，若是相等则继续比较一次，防止出现两个重复元素的情况
*/
