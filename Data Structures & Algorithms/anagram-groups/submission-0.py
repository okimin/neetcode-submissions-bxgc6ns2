class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = []
        anaMap = dict()
        for string in strs:
            test = "".join(sorted(string))
            print(test)
            if test in anaMap:
                anaMap[test].append(string)
            else:
                anaMap[test] = [string]
        
        for key in anaMap:
            res.append(anaMap[key])
        
        return res