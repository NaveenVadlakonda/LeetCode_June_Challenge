class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,h=nums.length-1;
         return binarySearch(0,nums.length-1,target,nums);
    }
    public int binarySearch(int l,int h,int target,int[] nums){
        int mid=0;
        if(l<=h){
            mid=l+(h-l)/2;
            if(target==nums[mid])
                return mid;
            else if(target<nums[mid])
                return binarySearch(l,mid-1,target,nums);
            return binarySearch(mid+1,h,target,nums);
        }
        /*else{
            if(target>nums[mid])
                return mid-1;
            else
                return mid+1;
            }*/
        return mid;
    }
}