class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numSet = {}
        for i in range(len(nums)):
            #print(numSet)
            if (target - nums[i]) in numSet:
                return [numSet[target - nums[i]],i]
            else:
                numSet[nums[i]] = i
        
    