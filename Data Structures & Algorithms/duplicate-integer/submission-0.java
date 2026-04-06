class Solution {
    /*
    Brute force
    Iterate through arry
    compare new element to the old element

    1. Sorting then compare new element to the old element
    2. Nested Loop to compare new element to the old element
    3. 
    */
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int x =0; x< nums.length; x++){
            if(!numSet.contains(nums[x])){
                numSet.add(nums[x]);
            }
            else{
                return true;
            }
        }

        return false;
    }
}