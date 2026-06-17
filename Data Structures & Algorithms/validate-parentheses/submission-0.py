class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for c in s:
            if c in {'[', '(','{'}:
                stack.append(c)
            elif len(stack) == 0:
                return False
            elif c == ']' and stack[-1] != '[':
                return False
            elif c == '}' and stack[-1] != '{':
                return False
            elif c == ')' and stack[-1] != '(':
                return False
            else:
                stack.pop()
        
        return len(stack) == 0
