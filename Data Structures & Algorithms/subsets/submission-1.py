class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        #empty list
        #[1, 2, 3]
        #[], [1], [2], [1,2], [1,3], [2,3], [3], [1, 2, 3] - O(n) * 2^n
        res = [] #total number of subsets
        subset = [] #current subset we're working on

        def dfs(i):
            if i == len(nums):
                res.append(subset.copy())
                return
            subset.append(nums[i])
            dfs(i + 1)
            subset.pop()
            dfs(i + 1)
        dfs(0)
        return res