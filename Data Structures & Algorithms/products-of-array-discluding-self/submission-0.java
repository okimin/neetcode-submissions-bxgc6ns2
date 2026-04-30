class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] leftSide = new int[nums.length];
        int [] rightSide = new int [nums.length];

        leftSide[0] = 1;
        for(int x = 1; x < nums.length; x++){
            leftSide[x] = leftSide[x-1] * nums[x-1];
        }

        rightSide[rightSide.length-1] = 1;
        for(int x = nums.length - 2; x >= 0; x--){
            rightSide[x] = rightSide[x+1] * nums[x+1];
        }
        int [] res = new int[nums.length];
        for(int x = 0; x < nums.length; x++){
            res[x] = leftSide[x] * rightSide[x];
        }

        return res;

    }
}  
