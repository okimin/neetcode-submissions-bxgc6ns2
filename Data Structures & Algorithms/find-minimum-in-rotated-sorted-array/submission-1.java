class Solution {

    /*
    Similar to finding a target except we get a min
    Using 
    */
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length -1;

        while(left < right){
            int mid = left + (right - left)/2;
            System.out.println(mid + " " + left + " " + right);
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }
            else if(nums[mid] < nums[right]){
                right = mid;
            }
        }

        return nums[left];
    }
}
