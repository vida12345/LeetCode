class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3)
            return false;
        
        int i = 0;
        
        do{
            if(nums[i] < nums[i+1] && nums[i+1] < nums[i+2])
                return true;
            i++;

        }while(i<nums.length-2);

        return false;
        
    }
}