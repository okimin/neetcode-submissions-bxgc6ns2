class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        leftSide = [1]
        rightSide = [1]
        res = []

        for i in range(1,len(nums)):
            print(len(nums)- 1)
            leftSide.append(leftSide[len(leftSide) - 1] * nums[i - 1])
        
        for i in range(len(nums) - 2,-1, -1):
            #print(i)
            rightSide.insert(0,rightSide[0] * nums[i + 1])
        
        print(leftSide)
        print(rightSide)
        
        for i in range(0,len(nums)):
            res.append(leftSide[i] * rightSide[i])
        
        return res


