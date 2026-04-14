class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # print(Counter(s))
        # print(Counter(t))
        return Counter(s) == Counter(t)
        # s_count = {}
        # t_count = {}

        # for c in list(s):
        #     if c in s_count:
        #         s_count[c] = s_count[c] + 1
        #     else:
        #         s_count[c] = 1
        
        # for c in list(t):
        #     if c in t_count:
        #         t_count[c] = t_count[c] + 1
        #     else:
        #         t_count[c] = 1
        
        # if len(s_count) != len(t_count):
        #     return False

        # for c in s_count:
        #     if c not in t_count or s_count[c] != t_count[c]:
        #         return False
        
        # return True
        