class Solution {
    public int removeDuplicates(int[] nums) {
        int t=1,j,k = 1;
        for (int i = 0 ; i < nums.length-1 ; i++)
        {
            if (nums[i] == nums[i+1]){
                for (j = i ; j < nums.length-1 ; j++)
                    nums[j] = nums[j+1];
                i--;
                t++;
                if (t == nums.length)
                    break;
                continue;
            }
            k++;
        }
        return k;
    }
}