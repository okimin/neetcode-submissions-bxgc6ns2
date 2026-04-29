class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        pref = strs[0]
        def common(str1, str2) -> str:
            for i in range(len(str1)):
                
                if(str1[i] != str2[i]):
                    return str1[0:i]
            return str1
    
        for i in range(1,len(strs)):
            if(len(pref) < len(strs[i])):
                pref = common(pref,strs[i])
            else:
                pref = common(strs[i],pref)
            if pref == "":
                return pref

        return pref
